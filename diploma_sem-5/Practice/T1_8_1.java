public class T1_8_1 {
	public static void main(String[] args) {
		float arr[][] = new float[3][];

		arr[0] = new float[1];
		arr[1] = new float[2];
		arr[2] = new float[3];


		arr[0][0] = (float)-56.7;
		arr[1][0] = (float)500.1;
		arr[1][1] = (float)70.70;
		arr[2][0] = (float)100.9;
		arr[2][1] = (float)0.5;
		arr[2][2] = (float)20.20;

		System.out.println("Contents of 2D Jagged Array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
	}
}