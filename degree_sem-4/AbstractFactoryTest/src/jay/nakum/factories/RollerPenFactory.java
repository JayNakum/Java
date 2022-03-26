package jay.nakum.factories;

import java.util.Random;
import java.util.Scanner;

import jay.nakum.pens.MyPen;
import jay.nakum.pens.roller.Pilot;
import jay.nakum.pens.roller.UniBall;

public class RollerPenFactory extends PenFactory{

	@Override
	public MyPen company() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the brand you require: "
				+ "\n0) Pilot"
				+ "\n1) Uni-Ball"
				+ "\n2) Any");
		System.out.print("Choose: ");
		int choice = in.nextInt();
//		in.close();
		if(choice > 2) {
			choice = new Random(2).nextInt();
		}
		
		switch (choice) {
		case 0: 
			return new Pilot();
		case 1:
			return new UniBall();
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
	}

}
