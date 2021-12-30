/* Write a program that calculate percentage marks of the student if marks of 6 subjects are given.
*/

import java.util.Scanner;

public class P01Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Marks (out of 100): ");
        System.out.print("Subject 1: ");
        double m1 = sc.nextDouble();
        System.out.print("Subject 2: ");
        double m2 = sc.nextDouble();
        System.out.print("Subject 3: ");
        double m3 = sc.nextDouble();
        System.out.print("Subject 4: ");
        double m4 = sc.nextDouble();
        System.out.print("Subject 5: ");
        double m5 = sc.nextDouble();
        System.out.print("Subject 6: ");
        double m6 = sc.nextDouble();
        sc.close();

        double percentage = ((m1 + m2 + m3 + m4 + m5 + m6) / 6);

        System.out.println("Percentage = " + percentage + "%");

    }
}
