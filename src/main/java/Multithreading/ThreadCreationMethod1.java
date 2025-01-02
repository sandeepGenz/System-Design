package src.main.java.Multithreading;

// Extending the thread classs

public class ThreadCreationMethod1 extends Thread{


    public ThreadCreationMethod1(String s) {
        super(s);
    }

    @Override
    public void run(){
        for(int i=0;i<5;i++)
        {
            System.out.println( "Inside "+ Thread.currentThread()+" "+ i);
        }
    }
}
