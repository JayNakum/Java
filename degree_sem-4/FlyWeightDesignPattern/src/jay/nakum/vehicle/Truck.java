package jay.nakum.vehicle;

public class Truck implements Vehicle {
    private final String MAXSPEED; // Intrinsic property
    private String color; // Extrinsic property

    Truck() {
        MAXSPEED = "120 km/hr";
    }

    @Override
    public void assignColor(String color) {
        this.color = color;
    }

    @Override
    public void startEngine() {
        System.out.println(color + " colored Truck with Max speed:" + MAXSPEED);
    }
}
