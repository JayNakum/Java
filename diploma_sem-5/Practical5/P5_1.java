public class P5_1 {
	public static void main(String[] args) {
		int a = 6;
		int b = 0;

		try {
			int c = a / b;
		}
		catch(ArithmeticException ae) {
			System.out.println("Zero Divide!");
		}
		finally {
			System.out.println("Next Code");
		}
	}
}