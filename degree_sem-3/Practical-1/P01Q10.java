/* Write an interactive program to print a diamond shape. For example, if user enters the number 3, the diamond will be as follows:
  *
 * *
* * *
 * *
  *
*/

import java.util.Scanner;

public class P01Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int length = sc.nextInt();
        sc.close();

        for (int row = 0; row < length; row++) {
            for (int spaces = (length - row); spaces > 0; spaces--) {
                System.out.print(" ");
            }
            for (int i = 0; i <= row; i++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        for (int row = (length - 2); row >= 0; row--) {
            for (int spaces = (length - row); spaces > 0; spaces--) {
                System.out.print(" ");
            }
            for (int i = 0; i <= row; i++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
