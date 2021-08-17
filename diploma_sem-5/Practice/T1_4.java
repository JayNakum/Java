import java.util.Scanner;

class Swap {
	public void swapVar(int a, int b) {
		int tmp = 0;
		System.out.println("Using Third Variable:");
		tmp = a;
		a = b;
		b = tmp;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	public void swapNoVar(int a, int b) {
		System.out.println("Without Using Third Variable:");
		b = a + b;
		a = b - a;
		b = b - a;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}

public class T1_4 {
	public static void main(String[] args) {
		int a = 0, b = 0;

		Swap swap = new Swap();
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter A: ");
		a = sc.nextInt();
		System.out.print("Enter B: ");
		b = sc.nextInt();

		swap.swapVar(a, b);
		swap.swapNoVar(a, b);
	}
}