/* Write a program to print full pyramid of numbers.
*/

import java.util.Scanner;

public class P01Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int length = sc.nextInt();
        sc.close();

        int value = 1;
        for (int row = 0; row <= length; row++) {
            for (int spaces = (length - row); spaces > 0; spaces--) {
                System.out.print("  ");
            }
            for (int elements = 0; elements < (row + (row - 1)); elements++) {
                if (elements < row) {
                    value += 1;
                } else {
                    value -= 1;
                }
                System.out.print(value + " ");
            }
            value = row;
            System.out.print("\n");
        }
    }
}
