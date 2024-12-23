package src.main.java.FactoryPattern;

public class Bike implements Vehicle {
    @Override
    public void display() {
        System.out.println("Bike");
    }

    @Override
    public void manufacturer() {
        System.out.println("Splendor");
    }
}
