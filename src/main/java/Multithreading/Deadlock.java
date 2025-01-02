package src.main.java.Multithreading;

//Simulate the deadlock situation
public class Deadlock {

    String lock1 = "Sandeep";
    String lock2 = "N";

    Thread thread1 = new Thread(()->{
        synchronized (lock1)
        {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (lock2){
                System.out.println("Lock acquired");
            }
        }
    }, "Thread1");

    Thread thread2 = new Thread(()->{
        synchronized (lock2)
        {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (lock1){
                System.out.println("Lock acquired");
            }
        }
    }, "Thread2");

}

// Reversing the locks -- deadlock