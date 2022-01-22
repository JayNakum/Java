package FD;

import java.util.Scanner;

public class MyOS {
public static void main(String args[])
{
	Scanner in = new Scanner(System.in);
	System.out.print("Enter your Requirement[Open, Closed]: ");
	String req = in.nextLine();
	in.close();
	
	OperatingSystemFactory osf = new OperatingSystemFactory();
	OS obj1 = osf.findOS(req);
	obj1.version();
	obj1.spec();
}
}
