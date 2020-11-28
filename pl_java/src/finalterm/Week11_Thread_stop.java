package finalterm;

class PriorityThread extends Thread{
    public long cnt;

    PriorityThread(int p){
        setPriority(p);
        start();
    }

    public void run(){
        while(true) cnt++;
    }
}

public class Week11_Thread_stop {
    public static void main(String[] args) {
        PriorityThread t01 = new PriorityThread(1);
        PriorityThread t02 = new PriorityThread(5);
        PriorityThread t03 = new PriorityThread(10);


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t01.interrupt();
        t02.interrupt();
        t03.interrupt();

        System.out.println("t01 count : " + t01.cnt);
        System.out.println("t02 count : " + t02.cnt);
        System.out.println("t03 count : " + t03.cnt);
    }
}
