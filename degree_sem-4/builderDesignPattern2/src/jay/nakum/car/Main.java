package jay.nakum.car;

public class Main {

	public static void main(String[] args) {
		MyCar car = new MyCarBuilder()
				.setModelName("Phantom")
				.setManufacturer("Rolls Royce")
				.setCost(10.48)
				.setSeatingCapicity(5)
				.setEngine("v12 6749cc")
				.setHorsePower(563)
				.setMilage(9.8)
				.setTopSpeed(250)
				.setFuelType("Petrol")
				.setFuelCapacity(100)
				.setBodyType("Sedan")
				.getMyCar();
		System.out.println(car.toString());
	}

}
