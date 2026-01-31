package src.main.java.LLD.ParkingLot;
// 7
public abstract class ParkingSpot {
    private final String id;
    private Vehicle parkedVehicle;

    private boolean free = true;

    public ParkingSpot(String id) {
        this.id = id;
    }

    public boolean isFree() {
        return free;
    }

    public void park(Vehicle vehicle) {
        this.parkedVehicle = vehicle;
        free = false;
    }

    public void unpark() {
        this.parkedVehicle = null;
        free = true;
    }

    public abstract boolean canFit(Vehicle vehicle);

}
