package src.main.java.StrategyDesignPattern;

public class SportsCar extends Vehicle{
    SportsCar(DriveStrategy strategy)
    {
        super(strategy);
    }
}
