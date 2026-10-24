package src.main.java.StrategyDesignPattern.Driver;

public class VehicleUtil {
    public static void main(String[] args) {
        Vehicle goodsVehicle = new GoodsVehicle();
        goodsVehicle.drive();
    }
}
