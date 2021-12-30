/* Write a program in Java to find maximum of three numbers using conditional operator.
*/

import java.util.Scanner;

public class P01Q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        System.out.print("c = ");
        int c = sc.nextInt();
        sc.close();

        System.out.println("Maximum out of " + a + ", " + b + " and " + c);
        if (a > b && a > c) {
            System.out.println("a = " + a + " is maximum.");
        } else if (b > a && b > c) {
            System.out.println("b = " + b + " is maximum.");
        } else {
            System.out.println("c = " + c + " is maximum.");
        }

    }
}
