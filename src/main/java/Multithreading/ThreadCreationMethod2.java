package src.main.java.Multithreading;

// implementing the runnable (Industry preferred)
public class ThreadCreationMethod2 implements Runnable {

    @Override
    public void run() {
        for(int i=0;i<5;i++)
        {
            System.out.println( "Inside "+ Thread.currentThread()+" "+ i);
        }
    }
}
