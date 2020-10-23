package ro.mta.facc.selab;

public class MyThread extends Thread{
    @Override
       public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(20*100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
