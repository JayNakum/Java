package jay.nakum.car;

public class MyCar {
	
	private String modelName;
	private String manufacturer;
	private double cost;
	private int seatingCapacity;
	private String engine;
	private double horsePower;
	private double milage;
	private double topSpeed;
	private String fuelType;
	private int fuelCapacity;
	private String bodyType;
	
	public MyCar(String modelName, String manufacturer, double cost, int seatingCapacity, String engine,
			double horsePower, double milage, double topSpeed, String fuelType, int fuelCapacity, String bodyType) {
		this.modelName = modelName;
		this.manufacturer = manufacturer;
		this.cost = cost;
		this.seatingCapacity = seatingCapacity;
		this.engine = engine;
		this.horsePower = horsePower;
		this.milage = milage;
		this.topSpeed = topSpeed;
		this.fuelType = fuelType;
		this.fuelCapacity = fuelCapacity;
		this.bodyType = bodyType;
	}

	public String toString() {
		return "\nModel Name: " + modelName
				+ "\nManufacturer Company: " + manufacturer
				+ "\nCost: " + cost
				+ "\nSeating Capacity: " + seatingCapacity
				+ "\nEngine: " + engine
				+ "\nHorse Power: " + horsePower
				+ "\nMilage: " + milage
				+ "\nTop Speed: " + topSpeed
				+ "\nFuel Type: " + fuelType
				+ "\nFuel Capacity: " + fuelCapacity
				+ "\nBody Type: " + bodyType;
	}
}
