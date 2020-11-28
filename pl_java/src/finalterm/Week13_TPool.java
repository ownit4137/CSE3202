package finalterm;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Week13_TPool {
    public static void main(String[] args) {
        ExecutorService eService = Executors.newFixedThreadPool(3);

        for(int k = 0; k < 5; k++){
            Runnable r = () -> {
                ThreadPoolExecutor tPExecutor = (ThreadPoolExecutor)eService;
                System.out.println(tPExecutor.getPoolSize() + " : " + Thread.currentThread().getName());
                System.out.println(9/0);
            };


            // eService.execute(r);
            // 예외가 발생한 스레드를 제거하고 새로운 스레드를 할당

            eService.submit(r);
            // 예외가 발생한 스레드가 끝나길 기다린 후 스레드에게 다음 작업을 할당



            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        eService.shutdown();
    }
}
