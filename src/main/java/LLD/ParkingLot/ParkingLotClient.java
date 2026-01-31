package src.main.java.LLD.ParkingLot;
// 15
public class ParkingLotClient {
    public static void main(String[] args) {
        ParkingLot parkingLot = ParkingLot.getInstance(new FirstAvailableStrategy());
        ParkingFloor floor1 = new ParkingFloor("F1");
        floor1.addParkingSpot(new CompactSpot("C1"));
        floor1.addParkingSpot(new BikeSpot("F1-B1"));
        ParkingFloor floor2 = new ParkingFloor("F2");
        floor2.addParkingSpot(new CompactSpot("C3"));
        floor2.addParkingSpot(new BikeSpot("F3-B3"));

        parkingLot.addFloor(floor1);
        parkingLot.addFloor(floor2);


        // Create vehicles into the system

        Vehicle v1 = VehicleFactory.createVehicle("KA001",VehicleType.CAR);
        Vehicle v2 = VehicleFactory.createVehicle("KA002",VehicleType.BIKE);

        Ticket t1 = parkingLot.parkVehicle(v1);
        Ticket t2 = parkingLot.parkVehicle(v2);

        System.out.println("Vehicle t1 is parked at " + t1.getId());
        System.out.println("Vehicle t2 is parked at " + t2.getId());

    }
}
