package src.main.java.StrategyDesignPattern;

public class OffroadVehicle extends Vehicle{

    OffroadVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }

}
