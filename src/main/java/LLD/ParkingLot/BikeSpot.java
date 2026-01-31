package src.main.java.LLD.ParkingLot;
// 9
public class BikeSpot extends ParkingSpot{
    public BikeSpot(String id) {
        super(id);
    }

    @Override
    public boolean canFit(Vehicle vehicle) {
        return vehicle.getVehicleType() == VehicleType.BIKE;
    }
}
