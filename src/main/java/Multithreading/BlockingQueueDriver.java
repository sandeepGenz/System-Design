package src.main.java.Multithreading;

public class BlockingQueueDriver {
    public static void main(String[] args) {
        // Create a BlockingQueue with a capacity of 5
        BlockingQueue queue = new BlockingQueue(5);

        // Producer thread
        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Producer is producing: " + i);
                queue.add(i); // Add items to the queue
                try {
                    Thread.sleep(100); // Simulate time taken to produce
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Consumer thread
        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                int item = queue.remove(); // Remove items from the queue
                System.out.println("Consumer is consuming: " + item);
                try {
                    Thread.sleep(150); // Simulate time taken to consume
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Start producer and consumer threads
        producer.start();
        consumer.start();

        // Wait for threads to finish
        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Producer and Consumer have finished their tasks.");
    }
}