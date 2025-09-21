package Multithreading;

public class Main {
    public static void main(String[] args) {

        // by extending Thread class
        for(int i=0;i<10;i++) {
            MultiThreadDemo object = new MultiThreadDemo();
            object.start();
        }

        System.out.println("///////////////////////////////////////////");

        //by implementing Runnable
        for (int i = 0; i < 10; i++) {
            Thread object = new Thread(new MultiThreadingRunnable());
            object.start();
        }
    }
}


// by extending Thread class