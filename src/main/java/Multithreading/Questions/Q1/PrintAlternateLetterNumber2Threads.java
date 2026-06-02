package src.main.java.Multithreading.Questions.Q1;

public class PrintAlternateLetterNumber2Threads {
    public static void main(String[] args) throws InterruptedException {

        PrintAlternateLetterNumber2ThreadsHelper obj = new PrintAlternateLetterNumber2ThreadsHelper();

        Thread t1 = new Thread(() -> {
            try {
                for (char ch = 'A'; ch <= 'Z'; ch++) {
                    obj.printLetter();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                for (int i = 1; i <= 26; i++) {
                    obj.printNumber();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
