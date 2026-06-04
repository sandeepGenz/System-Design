package src.main.java.Multithreading.Questions.Q4;

/*
Implement a thread-safe counter class in java that supports increment and decrement operations.
Multiple threads should be able to increment and decrement the counter concurrently without any race conditions.
*/

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSafeCounter {


    public static void main(String[] args) throws InterruptedException {
        AtomicInteger count = new AtomicInteger(0);
        Thread incrementTask = new Thread(()->{
            for (int i=0;i<10000000;i++) {
                count.incrementAndGet();
            }
        });

        Thread decrementTask = new Thread(()->{
            for (int i=0;i<10000000;i++) {
                count.decrementAndGet();
            }
        });


        incrementTask.start();
        decrementTask.start();

        incrementTask.join();
        decrementTask.join();

        System.out.println(count);
    }

}
