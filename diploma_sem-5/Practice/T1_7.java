import java.util.Scanner;

public class T1_7 {
	
	public boolean OddEven(int x) {
		if((x % 2) == 0) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		int x;

		T1_7 obj1 = new T1_7();
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		x = sc.nextInt();

		if(obj1.OddEven(x)) {
			System.out.println("Even!");
		}
		else {
			System.out.println("Odd!");
		}

	}
}