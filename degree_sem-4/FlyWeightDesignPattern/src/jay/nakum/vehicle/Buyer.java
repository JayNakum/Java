package jay.nakum.vehicle;

public class Buyer {
    public static void main(String[] args) {

        Vehicle cycle = VehicleFactory.getVehicle("Cycle");
        cycle.assignColor("Purple");
        cycle.startEngine();
        cycle.assignColor("White");
        cycle.startEngine();

        // Vehicle truck1=VehicleFactory.getVehicle("Car");

        Vehicle truck = VehicleFactory.getVehicle("Truck");
        truck.assignColor("Brown");
        truck.startEngine();

        Vehicle spaceGrayTruck = VehicleFactory.getVehicle("Truck");
        spaceGrayTruck.assignColor("SpaceGray");
        spaceGrayTruck.startEngine();
    }

}
