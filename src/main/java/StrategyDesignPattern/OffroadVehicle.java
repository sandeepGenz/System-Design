package src.main.java.StrategyDesignPattern;

public class OffroadVehicle extends Vehicle{

    OffroadVehicle() {
        super(new NormalDriveStrategy());
    }

}
