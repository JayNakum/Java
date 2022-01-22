package jay.nakum.phone;

public class MyPhone {
	private String brand;
	private String processor;
	private int ram;
	private double storage;
	private String os;
	private double screenSize;
	private int batteryMAH;
	
	public MyPhone(String brand, String processor, int ram, double storage, String os, double screenSize, int batteryMAH) {
		this.brand = brand;
		this.processor = processor;
		this.ram = ram;
		this.storage = storage;
		this.os = os;
		this.screenSize = screenSize;
		this.batteryMAH = batteryMAH;
	}
	
	public String toString() {
		return "Phone brand: " + brand 
				+ "\nProcessor: " + processor 
				+ "\nRam: " + ram 
				+ "\nStorage: " + storage 
				+ "\nOperating System: " + os 
				+ "\nScreen Size: " + screenSize 
				+ "\nBattery: " + batteryMAH;
	}
}
