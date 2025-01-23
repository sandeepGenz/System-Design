package src.main.java.StrategyDesignPattern;

import java.sql.SQLOutput;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Normal car is driving");
    }
}
