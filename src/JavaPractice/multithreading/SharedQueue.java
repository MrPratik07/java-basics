package JavaPractice.multithreading;

class SharedBuffer {
    private int data;
    private boolean hasData = false;

    public synchronized void produce(int value) throws InterruptedException {
        while (hasData) {
            wait(); // Wait if buffer is full
        }
        data = value;
        hasData = true;
        System.out.println("Produced: " + value);
        notify(); // Notify consumer
    }

    public synchronized int consume() throws InterruptedException {
        while (!hasData) {
            wait(); // Wait if buffer is empty
        }
        hasData = false;
        System.out.println("Consumed: " + data);
        notify(); // Notify producer
        return data;
    }
}

public class SharedQueue {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();

        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    buffer.produce(i);
                    Thread.sleep(500); // Simulate delay
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    buffer.consume();
                    Thread.sleep(800); // Simulate delay
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();
    }
}
