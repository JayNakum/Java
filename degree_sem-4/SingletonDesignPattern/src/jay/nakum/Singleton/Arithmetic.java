package jay.nakum.Singleton;

import java.util.Scanner;

public class Arithmetic {
	
	private static Arithmetic resource = new Arithmetic();
	public boolean isOccupied = false;
	
	private Scanner in = new Scanner(System.in);
	
	private Arithmetic() {}
	
	public static Arithmetic getResource() {
		return resource;
	}
	
	public void add(String username) {
		
		this.isOccupied = true;
		System.out.println(username + " is currently using this resource");
		System.out.print("Enter A: ");
		int a = in.nextInt();
		System.out.print("Enter B: ");
		int b = in.nextInt();
		System.out.println(a + " + " + b + " = " + ( a + b ));
		this.isOccupied = false;
		
	}
	
	public void subtract(String username) {
		
		this.isOccupied = true;
		System.out.println(username + " is currently using this resource");
		System.out.print("Enter A: ");
		int a = in.nextInt();
		System.out.print("Enter B: ");
		int b = in.nextInt();
		System.out.println(a + " - " + b + " = " + ( a - b ));
		this.isOccupied = false;
		
	}
}
