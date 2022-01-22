package jay.nakum.phone;

public class MyPhoneBuilder implements PhoneBuilder {

	private String brand;
	private String processor;
	private int ram;
	private double storage;
	private String os;
	private double screenSize;
	private int batteryMAH;

	@Override
	public MyPhoneBuilder setBrand(String brand) {
		this.brand = brand;
		return this;
	}

	@Override
	public MyPhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}

	@Override
	public MyPhoneBuilder setRAM(int ram) {
		this.ram = ram;
		return this;
	}

	@Override
	public MyPhoneBuilder setOS(String os) {
		this.os = os;
		return this;
	}

	@Override
	public MyPhoneBuilder setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}

	@Override
	public MyPhoneBuilder setBatteryMAH(int batteryMAH) {
		this.batteryMAH = batteryMAH;
		return this;
	}
	
	public MyPhone getMyPhone() {
		return new MyPhone(brand, processor, ram, storage, os, screenSize, batteryMAH);
	}
	
}
