package jay.nakum.phone;

public class Main {

	public static void main(String[] args) {
		MyPhone phone = new MyPhoneBuilder()
				.setBrand("Google Pixel")
				.setOS("Android")
				.setProcessor("Google Tensor Octa-core [2.8GHz]")
				.setRAM(12).setScreenSize(6.70)
				.setBatteryMAH(5000)
				.getMyPhone();
		
		System.out.println(phone.toString());
	}

}
