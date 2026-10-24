package src.main.java.StrategyDesignPattern.Driver;

public class SportsDriveStrategy implements DriverStrategy{
    @Override
    public void drive() {
        System.out.println("Sports");
    }
}
