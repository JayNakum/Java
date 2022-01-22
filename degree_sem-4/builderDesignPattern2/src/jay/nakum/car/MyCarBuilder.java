package jay.nakum.car;

public class MyCarBuilder implements CarBuilder {

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

	@Override
	public MyCarBuilder setModelName(String modelName) {
		this.modelName = modelName;
		return this;
	}

	@Override
	public MyCarBuilder setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
		return this;
	}

	@Override
	public MyCarBuilder setCost(double cost) {
		this.cost = cost;
		return this;
	}

	@Override
	public MyCarBuilder setSeatingCapicity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
		return this;
	}

	@Override
	public MyCarBuilder setEngine(String engine) {
		this.engine = engine;
		return this;
	}

	@Override
	public MyCarBuilder setHorsePower(double horsePower) {
		this.horsePower = horsePower;
		return this;
	}

	@Override
	public MyCarBuilder setMilage(double milage) {
		this.milage = milage;
		return this;
	}

	@Override
	public MyCarBuilder setTopSpeed(double topSpeed) {
		this.topSpeed = topSpeed;
		return this;
	}

	@Override
	public MyCarBuilder setFuelType(String fuelType) {
		this.fuelType = fuelType;
		return this;
	}

	@Override
	public MyCarBuilder setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
		return this;
	}

	@Override
	public MyCarBuilder setBodyType(String bodyType) {
		this.bodyType = bodyType;
		return this;
	}
	
	public MyCar getMyCar() {
		return new MyCar(modelName, manufacturer, cost, seatingCapacity, engine, horsePower, milage, topSpeed, fuelType, fuelCapacity, bodyType);
	}

}
