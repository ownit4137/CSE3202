package finalterm.Week12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class TEServer implements Runnable{
    public static Socket clientSocket;

    public TEServer(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    public static void main(String[] args) {
        System.out.println("스레드 에코 서버 시작");
        try(ServerSocket sSocket = new ServerSocket(10000)) {
            while(true) {
                System.out.println("연결 대기 중 ...");
                clientSocket = sSocket.accept();
                System.out.println("연결됨");
                TEServer tes = new TEServer(clientSocket);
                new Thread(tes).start(); // 스레드가 무한으로 늘어남
            }

        } catch(IOException ex){
            ex.printStackTrace();
        }
        System.out.println("TES 종료");
    }

    @Override
    public void run() {
        System.out.println("클라이언트 : " + Thread.currentThread() + " 연결됨");
        try(
                // cSocket의 istream -> br에 저장
                BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                // out에 저장 -> cSocket의 ostream
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        ){
                /* Old School

                String inputLine;
                while((inputLine = br.readLine()) != null){
                    System.out.println("클라이언트 메시지 : " + inputLine);
                    out.println(inputLine);
                }*/

            Supplier<String> socketInput = () -> {
                try {
                    return br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                    return null;
                }
            };
            Stream<String> stream = Stream.generate(socketInput);
            stream.map(s -> {
                System.out.println("클라이언트 " + Thread.currentThread().getName() + " 메시지 : " + s);
                out.println(s);
                return s;
            }).allMatch(s -> s != null);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
