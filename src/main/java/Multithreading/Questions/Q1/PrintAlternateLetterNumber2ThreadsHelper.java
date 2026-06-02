package src.main.java.Multithreading.Questions.Q1;

public class PrintAlternateLetterNumber2ThreadsHelper {

    boolean shared = true;

    char ch = 'A';
    int initial = 1;

    public synchronized void printLetter() throws InterruptedException {

        if(!shared) {
            wait();
        }


        System.out.println(this.ch);
        this.ch = (char) (this.ch + 1);
        shared = !shared;
        notify();

    }

    public synchronized void printNumber() throws InterruptedException {
        if(shared) {
            wait();

        }
        System.out.println(initial);
        initial += 1;
        shared = !shared;
        notify();

    }

}
