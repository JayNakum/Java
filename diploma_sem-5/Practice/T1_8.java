public class T1_8 {
	public static void main(String[] args) {
		float arr[][] = new float[3][3];

		arr[0][0] = (float)-56.7;
		arr[1][0] = (float)500.1;
		arr[1][1] = (float)70.70;
		arr[2][0] = (float)100.9;
		arr[2][1] = (float)0.5;
		arr[2][2] = (float)20.20;

		System.out.println("Length:");
		System.out.println("Rows= " + arr.length);
		System.out.println("Columns= " + arr[0].length);
		System.out.println("");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++ ) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
	}
}