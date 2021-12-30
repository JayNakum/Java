/* Write a program to count the number of words that start with capital letters.
*/

import java.util.Scanner;

public class P01Q07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a line: ");
        String str = sc.nextLine();
        sc.close();

        int length = str.length();
        int count = 0;

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 95) {
                count += 1;
            }
        }

        System.out.println(count + " words start with Uppercase");
    }
}
