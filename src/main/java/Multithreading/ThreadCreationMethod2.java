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

/*

1. See Doc of Thread.class
2. We are passing the instance of Runnable to the Thread class so the target of type runnable is not empty

***** You just extend the original Thread class and provide the Runnable object


 */