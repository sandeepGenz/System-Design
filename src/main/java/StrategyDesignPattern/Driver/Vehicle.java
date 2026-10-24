package src.main.java.StrategyDesignPattern.Driver;

public class Vehicle {
    private final DriverStrategy driverStrategy;

    public Vehicle(DriverStrategy driverStrategy) {
        this.driverStrategy = driverStrategy;
    }

    public void drive() {
        driverStrategy.drive();
    }
}
