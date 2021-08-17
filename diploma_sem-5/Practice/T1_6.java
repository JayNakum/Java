import java.util.Scanner;

class Interest {
	public double simpleInterest(double p, double r, double n) {
		double interest = ((p * r * n)/100);
		return interest;
	}
}

public class T1_6 {
	public static void main(String[] args) {
		double p, r, n;
		double interest;

		Scanner sc = new Scanner(System.in);
		Interest in = new Interest();
	
		System.out.print("Enter Principle Amount: ");
		p = sc.nextDouble();
		System.out.print("Enter Rate: ");
		r = sc.nextDouble();
		System.out.print("Enter Number of Year(s): ");
		n = sc.nextDouble();

		interest = in.simpleInterest(p, r, n);
		System.out.println("Simple Interest: " + interest);

	}
}