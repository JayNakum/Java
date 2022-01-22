package jay.nakum.phone.availableOS;

import jay.nakum.phone.OperatingSystem;

public class Blackberry implements OperatingSystem{
	public void owners() {
		System.out.println("BlackBerry");
		System.out.println("----------Published By----------");
		System.out.println("BlackBerry is owned by BlackBerry");
		System.out.println();
	}

	public void requirements() {
		System.out.println("----------Device Requirements----------");
		System.out.println("You need a BlackBerry device");
		System.out.println();
	}
	
	public void specs() {
		System.out.println("----------Specifications----------");
		System.out.println("Latest Version: BlackBerry 10");
		System.out.println("BlackBerry is also secure");
		System.out.println("It is a closed source OS");
		System.out.println("It is discontinued");
		System.out.println();
	}

	public void cost() {
		System.out.println("----------Cost----------");
		System.out.println("cheaper than iOS");
		System.out.println();
	}
}
