package jay.nakum.vehicle;

public class Cycle implements Vehicle {
    private final String MAXSPEED; // Intrinsic property
    private String color; // Extrinsic property

    Cycle() {
        MAXSPEED = "15 km/hr";
    }

    @Override
    public void assignColor(String color) {
        this.color = color;
    }

    @Override
    public void startEngine() {
        System.out.println(color + " colored Cycle with Max speed:" + MAXSPEED);
    }
}
