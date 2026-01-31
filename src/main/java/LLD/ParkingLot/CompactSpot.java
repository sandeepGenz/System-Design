package src.main.java.LLD.ParkingLot;
// 8
public class CompactSpot extends ParkingSpot{

    public CompactSpot(String id) {
        super(id);
    }
    @Override
    public boolean canFit(Vehicle vehicle) {
        return vehicle.getVehicleType() == VehicleType.CAR;
    }
}
