package src.main.java.StrategyDesignPattern;

public class Main {
    public static void main(String[] args)
    {
        Vehicle vehicle1 = new OffroadVehicle(new NormalDriveStrategy());
        vehicle1.drive();



    }
}
