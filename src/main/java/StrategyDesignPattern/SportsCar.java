package src.main.java.StrategyDesignPattern;

public class SportsCar extends Vehicle{
    SportsCar()
    {
        super(new SportsCarStrategy());
    }
}
