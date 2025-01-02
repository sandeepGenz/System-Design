package src.main.java.Multithreading;

public class ThreadTester {
    public static void main(String[] args)
    {
        System.out.println("Main thread is starting");

        // we can provide the name to the thread , here first in the argument down and then in the class , we need to overload the constructor

//        Thread thread1 = new ThreadCreationMethod1(" Namma Thread1 ");

//        thread1.setDaemon(true);

//        thread1.start(); // acynchronous method


        // ---------------- method 2 ---------------

        Thread thread2 = new Thread(()->{
            for(int i=0;i<5;i++)
            {
                System.out.println( "Inside "+ Thread.currentThread()+" "+ i);
            }
        } , " Namma Thread2 ");
        thread2.start();


        System.out.println("Main is exiting");
    }
}
