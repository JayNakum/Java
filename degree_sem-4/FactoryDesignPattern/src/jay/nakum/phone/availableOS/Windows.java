package jay.nakum.phone.availableOS;

import jay.nakum.phone.OperatingSystem;

public class Windows implements OperatingSystem {

	public void owners() {
		System.out.println("WINDOWS");
		System.out.println("----------Published By----------");
		System.out.println("Windows is owned by Microsoft");
		System.out.println();
	}

	public void requirements() {
		System.out.println("----------Device Requirements----------");
		System.out.println("outdated");
		System.out.println();
	}
	
	public void specs() {
		System.out.println("----------Specifications----------");
		System.out.println("Latest Version: 8.1");
		System.out.println("It is a closed source OS");
		System.out.println();
	}

	public void cost() {
		System.out.println("----------Cost----------");
		System.out.println("Cheaper than iOS");
		System.out.println();
	}

}
