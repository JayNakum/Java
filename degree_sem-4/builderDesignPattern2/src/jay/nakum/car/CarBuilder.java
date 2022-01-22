package jay.nakum.car;

public interface CarBuilder {
	public MyCarBuilder setModelName(String modelName);
	public MyCarBuilder setManufacturer(String manufacturer);
	public MyCarBuilder setCost(double cost);
	public MyCarBuilder setSeatingCapicity(int seatingCapacity);
	public MyCarBuilder setEngine(String engine);
	public MyCarBuilder setHorsePower(double horsePower);
	public MyCarBuilder setMilage(double milage);
	public MyCarBuilder setTopSpeed(double topSpeed);
	public MyCarBuilder setFuelType(String fuelType);
	public MyCarBuilder setFuelCapacity(int fuelCapacity);
	public MyCarBuilder setBodyType(String bodyType);
}
