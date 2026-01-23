package src.main.java.SingletonDesignPattern;

public class BillPughDriver {
    public static void main(String[] args) {
        BillPughSingletonDP instance1 = BillPughSingletonDP.getInstance();
        BillPughSingletonDP instance2 = BillPughSingletonDP.getInstance();

        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance1 == instance2); // should print true
    }
}