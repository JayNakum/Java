import java.util.Scanner;

class AreaOfCircle {
	final double PI = 3.14;
	public double area(int r) {
		double ar = PI * (r*r);
		return ar;
	}
}

public class T1_3 {
	public static void main(String[] args) {
		int radius = 0;
		double area = 0;
		Scanner sc = new Scanner(System.in);
		AreaOfCircle ar = new AreaOfCircle();
		System.out.print("Enter Radius: ");
		radius = sc.nextInt();
		area = ar.area(radius);
		System.out.println("Area of Circle :" + area);
	}
}