package src.main.java.LLD.ParkingLot;

import java.util.List;
// 10
public interface ParkingStrategy {
    ParkingSpot findSpot(List<ParkingFloor> floors, Vehicle vehicle);
}
