/* Write a program in Java to generate first n prime numbers.
*/

import java.util.Scanner;

public class P01Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        int number = 0;
        int i = 2;
        System.out.println("Prime numbers from 1 to " + n + ":");
        for (number = 0; number <= n; number++) {
            i = 2;
            while (i < number) {
                if ((number % i) == 0) {
                    break;
                }
                i += 1;
            }
            if (i == number) {
                System.out.println(i);
            }
        }
    }
}
