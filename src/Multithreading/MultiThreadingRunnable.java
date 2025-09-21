package Multithreading;

public class MultiThreadingRunnable implements Runnable{

    @Override
    public void run() {
        try{
            System.out.println("Thread"+Thread.currentThread().getId());
        } catch (Exception e){
            System.out.println("Exception is caught");
        }
    }
}
