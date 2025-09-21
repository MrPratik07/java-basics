package Multithreading;

public class CreateThread extends Thread {
    public void run(){

        for(int i=0;i<10;i++){
            System.out.println ("hello");
        }
    }

    public static void main(String[] args) {
        CreateThread thread=new CreateThread();
        thread.start ();
        for(int i=0;i<10;i++) {
            System.out.println ("hi");
        }
    }

}




