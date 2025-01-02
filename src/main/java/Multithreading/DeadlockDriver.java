package src.main.java.Multithreading;

public class DeadlockDriver {
    public static void main(String[] args) {
        // Create a Deadlock instance
        Deadlock deadlock = new Deadlock();

        // Start the threads to simulate deadlock
        deadlock.thread1.start();
        deadlock.thread2.start();

        // Join threads to ensure main thread waits
        try {
            deadlock.thread1.join();
            deadlock.thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("If you see this message, the program has avoided or resolved the deadlock.");
    }
}