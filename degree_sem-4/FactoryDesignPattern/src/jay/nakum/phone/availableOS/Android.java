package jay.nakum.phone.availableOS;

import jay.nakum.phone.OperatingSystem;

public class Android implements OperatingSystem {

	public void owners() {
		System.out.println("ANDROID");
		System.out.println("----------Published By----------");
		System.out.println("Android is owned by Google");
		System.out.println();
	}

	public void requirements() {
		System.out.println("----------Device Requirements----------");
		System.out.println("RAM: 3GB");
		System.out.println("Storage: 32GB");
		System.out.println("Processor:");
		System.out.println("\tSpeed: 1.4GHz");
		System.out.println("\tArchitecture: 64bit");
		System.out.println();
	}
	
	public void specs() {
		System.out.println("----------Specifications----------");
		System.out.println("Latest Version: Android 11");
		System.out.println("Android is open source!");
		System.out.println();
	}

	public void cost() {
		System.out.println("----------Cost----------");
		System.out.println("Free");
		System.out.println();
	}

}
