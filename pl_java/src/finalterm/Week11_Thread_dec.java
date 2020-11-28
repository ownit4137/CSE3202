package finalterm;

class Gugudan extends Thread{
    public void run(){
        for(int dan = 2; dan < 10; dan++){
            for(int n = 1; n < 10; n++){
                System.out.println(dan + " * " + n + " = " + (dan * n));
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Week11_Thread_dec {
    public static void main(String[] args) {
        Thread gugu = new Gugudan();
        gugu.start();

        for(int i = 0; i < 10; i++) {
            System.out.println("--- main thread ---");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
