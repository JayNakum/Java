public class P5_2 {
	public static void main(String[] args) {
		int a[] = new int[10];
		int i = 11;
		try {
			a[i] = 6;
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Damn it muffin head!!\nArray isn't declared that long!\nYou son of a...");
		}
		finally {
			System.out.println("Fudge you!");
		}
	}
}