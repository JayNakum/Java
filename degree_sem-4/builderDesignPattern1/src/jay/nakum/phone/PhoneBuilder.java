package jay.nakum.phone;

public interface PhoneBuilder {
	public MyPhoneBuilder setBrand(String brand);
	public MyPhoneBuilder setProcessor(String processor);
	public MyPhoneBuilder setRAM(int ram);
	public MyPhoneBuilder setOS(String os);
	public MyPhoneBuilder setScreenSize(double screenSize);
	public MyPhoneBuilder setBatteryMAH(int batteryMAH);
}
