package src.main.java.LLD.ParkingLot;

import java.util.ArrayList;
import java.util.List;
// 14
public class ParkingLot {
    private static ParkingLot INSTANCE;
    private List<ParkingFloor> floors = new ArrayList<>();
    private ParkingStrategy parkingStrategy;

    public ParkingLot(ParkingStrategy parkingStrategy) {
        this.parkingStrategy = parkingStrategy;
    }

    public static ParkingLot getInstance(ParkingStrategy parkingStrategy) {
        if (INSTANCE == null) {
            INSTANCE = new ParkingLot(parkingStrategy);
        }
        return INSTANCE;
    }

    // Add a floor
    public void addFloor(ParkingFloor floor) {
        floors.add(floor);
    }

    // Park a vehicle

    public Ticket parkVehicle(Vehicle vehicle) {
        ParkingSpot spot = parkingStrategy.findSpot(floors,vehicle);
        if(spot == null) {
            throw new RuntimeException("Parking spot could not be found");
        }
        spot.park(vehicle);
        return new Ticket(vehicle,spot);
    }

    // Unpark a vehicle

    public void unParkVehicle(Ticket ticket) {
        ticket.getParkingSpot().unpark();
    }


}
