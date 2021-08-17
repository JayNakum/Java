public class P5_4 {
	public static void main(String[] args) {
		int a = 6;
		int b = 0;
		int arr[] = new int[10];
		int i = 11;
		try {
			arr[i] = 6;
			int c = a / b;
		}
		catch(ArithmeticException ae) {
			System.out.println("Zero Divide!");
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Damn it muffin head!!\nArray isn't declared that long!\nYou son of a...");
		}
		finally {
			System.out.println("Better");
		}
	}
}