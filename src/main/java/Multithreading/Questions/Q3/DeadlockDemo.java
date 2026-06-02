package src.main.java.Multithreading.Questions.Q3;

public class DeadlockDemo {

    public static void main(String[] args) {
        String golu = "golu";
        String molu = "molu";

        Thread t1 = new Thread(() -> {
            synchronized (golu) {
                System.out.println("Golu acquired lock");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (molu) {
                    System.out.println("Molu acquired lock");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (molu) {
                System.out.println("Molu acquired lock");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (golu) {
                    System.out.println("Golu acquired lock");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        t1.start();
        t2.start();
    }

}
