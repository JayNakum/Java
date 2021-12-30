/* Write a Java Program to find area of Geometric figures using method Overloading.
*/

import java.util.Scanner;

class Shape {

    double area(double length, double width) {
        if (width == 0) {
            width = length;
        }
        return (length * width);
    }

    double area(double radius) {
        final double PI = 3.14;
        return (PI * (radius * radius));
    }

}

public class P01Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape shape = new Shape();

        System.out.print("Enter length/radius: ");
        double a = sc.nextDouble();

        System.out.print("Area of Square: ");
        System.out.println(shape.area(a, 0));
        System.out.print("Area of Circle: ");
        System.out.println(shape.area(a));

        System.out.print("\nEnter width: ");
        double b = sc.nextDouble();
        sc.close();

        System.out.print("Area of Rectangle: ");
        System.out.println(shape.area(a, b));
    }
}
