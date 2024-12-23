package src.main.java.FactoryPattern;

public class Driver {

    public static void main(String[] args)
    {
        VehicleFactory car = new CarFactory();
        Vehicle vehicle1 = car.createVehicle();

        vehicle1.display();
        vehicle1.manufacturer();

        VehicleFactory bike = new BikeFactory();
        Vehicle vehicle2 = bike.createVehicle();
        vehicle2.display();
        vehicle2.manufacturer();

    }

}
