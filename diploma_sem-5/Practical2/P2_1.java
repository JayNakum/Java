import java.util.Scanner;

class Calculator {
	private double i, j;
	Calculator(double i, double j){
		this.i = i; 
		this.j = j;
	}
	public double calculate() {
		double ans = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Available Choices: ");
		System.out.println(" 1. Add\n 2. Subtract\n 3. Multiply\n 4. Divide\n 5. Modulo");
		System.out.print("Enter Choice: ");
		
		int ch = sc.nextInt();

		switch(ch) {
			case 1 : 
				ans = i + j; 
				break;
			case 2 : 
				ans = i - j; 
				break;
			case 3 : 
				ans = i * j; 
				break;
			case 4 : 
				ans = i / j; 
				break;
			case 5 : 
				ans = i % j; 
				break;
			default :
				System.out.println("Something Went Wrong!!");
		}
		return ans;
	}
}

public class P2_1 {
	public static void main(String[] args) {
		Calculator c = new Calculator(2, 4);
		double ans = c.calculate();
		System.out.println("Answer: " + ans);
	}
}