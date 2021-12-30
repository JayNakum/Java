/* Write a program to enter two numbers and perform mathematical operations on them.
*/

import java.util.Scanner;

public class P01Q03 {
    public static void main(String[] args) throws ArithmeticException {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        sc.close();

        System.out.println("\nBasic mathematical mperations on " + a + " and " + b + ":");
        answer = (a + b);
        System.out.println("Addition = " + answer);
        answer = (a - b);
        System.out.println("Subtraction = " + answer);
        answer = (a * b);
        System.out.println("Multiplication = " + answer);
        answer = (a / b);
        System.out.println("Division = " + answer);
        answer = (a % b);
        System.out.println("Modulo = " + answer);
    }
}
