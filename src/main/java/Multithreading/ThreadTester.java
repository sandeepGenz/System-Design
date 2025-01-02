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

//        Thread thread2 = new Thread(()->{
//            for(int i=0;i<5;i++)
//            {
//                System.out.println( "Inside "+ Thread.currentThread()+" "+ i);
//            }
//        } , " Namma Thread2 ");
//        thread2.start();

        BankAccount account = new BankAccount(1000); // Shared resource

        // Create threads representing users trying to withdraw money
        Thread user1 = new Thread(() -> account.withdraw(600), "User 1");
        Thread user2 = new Thread(() -> account.withdraw(500), "User 2");
        Thread user3 = new Thread(() -> account.withdraw(400), "User 3");

        // Start threads
        user1.start();
        user2.start();
        user3.start();


        System.out.println("Main is exiting");
    }
}
