package src.main.java.StrategyDesignPattern;

public class Vehicle{

    DriveStrategy strategy; // dependent

    Vehicle(DriveStrategy driveStrategy)
    {
        strategy = driveStrategy;
    }
    public void drive() {
        strategy.drive();
    }
}
