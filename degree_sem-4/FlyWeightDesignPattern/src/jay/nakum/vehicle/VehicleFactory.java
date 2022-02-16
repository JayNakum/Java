package jay.nakum.vehicle;

import java.util.HashMap;

public class VehicleFactory {
    private static HashMap<String, Vehicle> hashMap = new HashMap<String, Vehicle>();

    public static Vehicle getVehicle(String type) {
        Vehicle myVehicle = null;
        if (hashMap.containsKey(type)) {
        	myVehicle = hashMap.get(type);
        } else {
            switch (type) {
                case "Cycle":
                    System.out.println("Cycle is created");
                    myVehicle = new Cycle();
                    break;
                case "Truck":
                    System.out.println("Truck is created");
                    myVehicle = new Truck();
                    break;
                default:
                    throw new IllegalArgumentException("Vehicle type " + type + " does not exist");
            }
            hashMap.put(type, myVehicle);
        }
        return myVehicle;
    }
}
