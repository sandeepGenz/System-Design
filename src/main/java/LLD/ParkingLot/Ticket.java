package src.main.java.LLD.ParkingLot;

import java.util.UUID;
// 12
public class Ticket {
    private final String id;
    private final Vehicle vehicle;
    private final long timeIn;
    private final ParkingSpot parkingSpot;

    public Ticket(Vehicle vehicle, ParkingSpot parkingSpot) {
        this.id = UUID.randomUUID().toString();
        this.vehicle = vehicle;
        this.timeIn = System.currentTimeMillis();
        this.parkingSpot = parkingSpot;
    }

    public String getId() {
        return id;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }
}
