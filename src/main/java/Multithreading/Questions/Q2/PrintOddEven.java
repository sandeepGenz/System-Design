package src.main.java.Multithreading.Questions.Q2;

public class PrintOddEven {
    public static boolean odd = true; // shared

    public synchronized void runOdd() throws InterruptedException {


        for(int i=1;i<=20;) {
            while(!odd) {
                wait();
            }
            System.out.print(" " + i);
            odd = false;
            i+=2;
            notifyAll();
        }

    }

    public synchronized void runEven() throws InterruptedException {


        for(int i=2;i<=20;) {
            while(odd) {
                wait();
            }
            System.out.print(" " + i);
            odd = true;
            i += 2;
            notifyAll();
        }
    }
}
