package src.main.java.LLD.ParkingLot;

import java.util.ArrayList;
import java.util.List;
// 13
public class ParkingFloor {
    private final String floorName;
    private List<ParkingSpot> parkingSpots = new ArrayList<>();

    public ParkingFloor(String floorName) {
        this.floorName = floorName;
    }

    public void addParkingSpot(ParkingSpot spot) {
        parkingSpots.add(spot);
    }

    public ParkingSpot findSpotFor(Vehicle vehicle) {
        for(ParkingSpot spot : parkingSpots) {
            if(spot.isFree() && spot.canFit(vehicle)) {
                return spot;
            }
        }
        return null;
    }
}
