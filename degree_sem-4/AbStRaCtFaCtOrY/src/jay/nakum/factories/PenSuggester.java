package jay.nakum.factories;

import java.util.Random;
import java.util.Scanner;

public class PenSuggester {
	public int getType() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the type of pen you would like:"
				+ "\n0) Fountain Pen"
				+ "\n1) Roller Pen"
				+ "\n2) Ball Pen"
				+ "\n3) Any");
		System.out.print("Choose: ");
		int choice = in.nextInt();
		in.close();
		if(choice > 2) {
			choice = new Random().nextInt(3);
		}
		return choice;
	}
	public PenFactory suggest() {
		PenFactory myFactory = null;
		int requirement = this.getType();
		switch (requirement) {
		case 0: 
			myFactory = new FountainPenFactory();
			break;
		case 1:
			myFactory = new RollerPenFactory();
			break;
		case 2:
			myFactory = new BallPenFactory();
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + requirement);
		}
		return myFactory;
	}
}
