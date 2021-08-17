public class p1_3 {
	public static void main(String[] args) {
		int p;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				if ((i + j) % 2 == 0) {
					p = 1;		
				}
				else {
					p = 0;
				}
				System.out.print(p + " ");
			}
			System.out.println("");
		}
	}
}