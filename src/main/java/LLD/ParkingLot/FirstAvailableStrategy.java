package src.main.java.LLD.ParkingLot;

import java.util.List;
// 11
public class FirstAvailableStrategy implements ParkingStrategy{
    @Override
    public ParkingSpot findSpot(List<ParkingFloor> floors, Vehicle vehicle) {
        for(ParkingFloor floor : floors) {
            ParkingSpot spot = floor.findSpotFor(vehicle);
            if(spot != null) {
                return spot;
            }
        }
        return null;
    }
}
