package src.main.java.LLD.ParkingLot;
// 3
public abstract class Vehicle {
    private final String licenceNumber;
    private final VehicleType vehicleType;

    protected Vehicle(String licenceNumber, VehicleType vehicleType) {
        this.licenceNumber = licenceNumber;
        this.vehicleType = vehicleType;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }


}
