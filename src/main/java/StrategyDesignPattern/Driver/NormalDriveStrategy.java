package src.main.java.StrategyDesignPattern.Driver;

public class NormalDriveStrategy implements DriverStrategy{
    @Override
    public void drive() {
        System.out.println("Normal");
    }
}
