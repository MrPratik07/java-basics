package Multithreading;

class Printer {
    private int number = 1;
    private final int max = 10;

    public synchronized void printOdd() throws InterruptedException {
        while (number <= max) {
            if (number % 2 == 0) wait();
            else {
                System.out.println("Odd: " + number++);
                notify();
            }
        }
    }

    public synchronized void printEven() throws InterruptedException {
        while (number <= max) {
            if (number % 2 != 0) wait();
            else {
                System.out.println("Even: " + number++);
                notify();
            }
        }
    }

    public static void main(String args[]) {
        Printer printer = new Printer();

        Thread oddThread = new Thread(() -> {
            try {
                printer.printOdd();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread evenThread = new Thread(() -> {
            try {
                printer.printEven();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Start both threads
        oddThread.start();
        evenThread.start();
    }
}

