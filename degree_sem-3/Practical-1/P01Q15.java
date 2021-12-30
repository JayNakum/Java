/* Write a program to print Pascal’s triangle.
*/

import java.util.Scanner;

public class P01Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int length = sc.nextInt();
        sc.close();

        for (int row = 1; row <= length; row++) {
            for (int spaces = 0; spaces <= length - row; spaces++) {
                System.out.print(" ");
            }
            int col = 1;
            for (int i = 1; i <= row; i++) {
                System.out.print(col + " ");
                col = col * (row - i) / i;
            }
            System.out.println();
        }

        // Old Logic: 
        // int[] value = new int[length];
        // for(int i = 0 ; i < length ; i++) {
        // value[i] = (int) Math.pow(11, i);
        // }

    }
}
