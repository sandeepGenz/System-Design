package src.main.java.FactoryPattern;

public class Car implements Vehicle{

    @Override
    public void display() {
        System.out.println("Car");
    }

    @Override
    public void manufacturer() {
        System.out.println("Hyundai");
    }
}
