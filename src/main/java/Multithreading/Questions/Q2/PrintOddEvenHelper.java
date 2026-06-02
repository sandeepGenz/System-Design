package src.main.java.Multithreading.Questions.Q2;

public class PrintOddEvenHelper {
    public static void main(String[] args) throws InterruptedException {
        PrintOddEven obj = new PrintOddEven();

        Thread t1 = new Thread(() -> {
            try {
                obj.runOdd();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                obj.runEven();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
