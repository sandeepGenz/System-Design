package src.main.java.StrategyDesignPattern;

public class SportsCarStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Sports car driving");
    }
}
