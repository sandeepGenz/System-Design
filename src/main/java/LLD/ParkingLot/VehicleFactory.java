package src.main.java.LLD.ParkingLot;
// 6
public class VehicleFactory {

    public static Vehicle createVehicle(String licencePlate , VehicleType vehicleType) {
        switch (vehicleType) {
            case BIKE -> {
                return new Bike(licencePlate);
            }
            case CAR -> {
                return new Car(licencePlate);
            }
            default -> {
                throw new UnsupportedOperationException("This type of Vehicle is not allowed");
            }
        }
    }

}
