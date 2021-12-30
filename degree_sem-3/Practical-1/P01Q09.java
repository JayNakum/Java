/* Write an interactive program to print a string entered in a pyramid form.
For instance, the string "stream" has to be displayed as follows:
     s
    s t
   s t r
  s t r e
 s t r e a
s t r e a m
*/

import java.util.Scanner;

public class P01Q09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = sc.nextLine();
        sc.close();

        int length = str.length();
        for (int rows = 0; rows < length; rows++) {
            for (int spaces = (length - rows); spaces > 0; spaces--) {
                System.out.print(" ");
            }
            for (int i = 0; i <= rows; i++) {
                System.out.print(str.charAt(i) + " ");
            }
            System.out.print("\n");
        }
    }
}
