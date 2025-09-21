package JavaPractice.multithreading;

public class ThreadStatesExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(2000); // TIMED_WAITING
            } catch (InterruptedException e) {}
        });

        System.out.println(thread.getState()); // NEW
        thread.start();
        System.out.println(thread.getState()); // RUNNABLE

        Thread.sleep(100); // Wait for thread to go to sleep
        System.out.println(thread.getState()); // TIMED_WAITING

        thread.join(); // Wait for thread to finish
        System.out.println(thread.getState()); // TERMINATED
    }
}

