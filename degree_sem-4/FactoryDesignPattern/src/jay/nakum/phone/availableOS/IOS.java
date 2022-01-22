package jay.nakum.phone.availableOS;

import jay.nakum.phone.OperatingSystem;

public class IOS implements OperatingSystem {

	public void owners() {
		System.out.println("iOS");
		System.out.println("----------Published By----------");
		System.out.println("iOS is owned by Apple");
		System.out.println();
	}

	public void requirements() {
		System.out.println("----------Device Requirements----------");
		System.out.println("You need an iPhone");
		System.out.println();
	}
	
	public void specs() {
		System.out.println("----------Specifications----------");
		System.out.println("Latest Version: iOS 15");
		System.out.println("iOS is one of the most secure OS");
		System.out.println("It is a closed source OS");
		System.out.println();
	}

	public void cost() {
		System.out.println("----------Cost----------");
		System.out.println("It only comes with an iPhone");
		System.out.println();
	}

}
