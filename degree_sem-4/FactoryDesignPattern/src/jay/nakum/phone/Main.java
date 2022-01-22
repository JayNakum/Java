package jay.nakum.phone;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your requirement: ");
		System.out.println("\t[Easy to Use, Secure, Most used, Closed Source, Cheap and Secure]");
		String req = in.nextLine();
		in.close();
		
		OperatingSystem yourOS = new OSFactory(req).findOS();
		System.out.print("\nSuggested OS: ");
		yourOS.owners();
		yourOS.specs();
		yourOS.requirements();
		yourOS.cost();
		
	}

}
