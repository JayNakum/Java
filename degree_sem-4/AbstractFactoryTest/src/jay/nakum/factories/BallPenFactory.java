package jay.nakum.factories;

import java.util.Random;
import java.util.Scanner;

import jay.nakum.pens.MyPen;
import jay.nakum.pens.ball.Bic;
import jay.nakum.pens.ball.Piper;

public class BallPenFactory extends PenFactory {

	@Override
	public MyPen company() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the brand you require: "
				+ "\n1) Piper"
				+ "\n2) Bic"
				+ "\n3) Any");
		System.out.print("Choose: ");
		int choice = in.nextInt();
//		in.close();
		if(choice > 2) {
			choice = new Random(2).nextInt();
		}
		
		switch (choice) {
		case 1: 
			return new Piper();
		case 2:
			return new Bic();
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
	}

}
