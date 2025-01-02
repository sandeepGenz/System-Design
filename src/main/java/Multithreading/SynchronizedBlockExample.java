package src.main.java.Multithreading;

// Method Block Synchronization
class Counter {

    private int count = 0;

    public void increment()
    {
        synchronized (this){
            count ++;
        }
    }

    public int getCount(){
        return count;
    }

}


public class SynchronizedBlockExample {
    public static void main(String[] args) {
        Counter counter = new Counter(); // Shared resource

        // Create threads that increment the counter
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        // Start threads
        thread1.start();
        thread2.start();

        // Wait for threads to finish

        /*
        Think of join() as telling the main thread:

	    “Wait here until thread1 and thread2 finish their jobs. Once they’re done, you can proceed.”
         */

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final counter value
        System.out.println("Final Counter Value: " + counter.getCount());
    }
}
