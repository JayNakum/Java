/* Write a program in Java to create a simple scientific calculator using Math Class.
*/

import java.lang.Math;
import java.util.Scanner;

public class P01Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter operand a: ");
        double a = sc.nextDouble();
        System.out.print("Enter operand b: ");
        double b = sc.nextDouble();

        System.out.println("Operations available: ");
        System.out.println("1 --> Addition (a + b)");
        System.out.println("2 --> Subtraction (a - b)");
        System.out.println("3 --> Multiplication (a * b)");
        System.out.println("4 --> Division (a / b)");
        System.out.println("5 --> Minimum from (a , b)");
        System.out.println("6 --> Maximum from (a , b)");
        System.out.println("7 --> Power (a ^ b)");
        System.out.println("8 --> Square Root of (a)");
        System.out.println("9 --> Round(a)");
        System.out.println("10 --> Log(x)");
        System.out.println("11 --> sin(a)");
        System.out.println("12 --> cos(a)");
        System.out.println("13 --> tan(a)");
        System.out.println("14 --> Degree to Radian (a)");
        System.out.println("15 --> Radian to Degree (a)");
        System.out.print("\nEnter operation: ");
        int op = sc.nextInt();
        sc.close();
        
        switch (op) {
            case 1:
                System.out.println("a + b = " + (a + b));
                break;
            case 2:
                System.out.println("a - b = " + (a - b));
                break;
            case 3:
                System.out.println("a * b = " + (a * b));
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Cannot divide with 0");
                    break;
                }
                System.out.println("a / b = " + (a / b));
                break;
            case 5:
                System.out.println("min(a, b) = " + Math.min(a, b));
                break;
            case 6:
                System.out.println("max(a, b) = " + Math.max(a, b));
                break;
            case 7:
                System.out.println("a ^ b = " + Math.pow(a, b));
                break;
            case 8:
                System.out.println("sqrt(a) = " + Math.sqrt(a));
                break;
            case 9:
                System.out.println("Round value of a = " + Math.round(a));
                break;
            case 10:
                System.out.println("Log(a) = " + Math.log(a));
                break;
            case 11:
                System.out.println("sin(a) = " + Math.sin(a));
                break;
            case 12:
                System.out.println("cos(a) = " + Math.cos(a));
                break;
            case 13:
                System.out.println("tan(a) = " + Math.tan(a));
                break;
            case 14:
                System.out.println("Degree to Radian (a) = " + Math.toRadians(a));
                break;
            case 15:
                System.out.println("Radian to Degree (a) = " + Math.toDegrees(a));
                break;
            default:
                System.out.println("Invalid Choice :/");
                break;
        }
    }
}
