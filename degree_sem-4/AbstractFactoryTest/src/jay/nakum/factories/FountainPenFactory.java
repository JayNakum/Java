package jay.nakum.factories;

import java.util.Random;
import java.util.Scanner;

import jay.nakum.pens.MyPen;
import jay.nakum.pens.fountain.Cross;
import jay.nakum.pens.fountain.Parker;

public class FountainPenFactory extends PenFactory{

	@Override
	public MyPen company() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the brand you require: "
				+ "\n1) Parker"
				+ "\n2) Cross"
				+ "\n3) Any");
		System.out.print("Choose: ");
		int choice = in.nextInt();
//		in.close();
		if(choice > 2) {
			choice = new Random(2).nextInt();
		}
		
		switch (choice) {
		case 1: 
			return new Parker();
		case 2:
			return new Cross();
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
	}
	
}
