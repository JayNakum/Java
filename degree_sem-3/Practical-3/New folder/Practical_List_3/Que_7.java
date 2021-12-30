package Practical_List_3;

import java.util.Scanner;

public class Que_7 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the values of a and b");
        int a = cin.nextInt();
        int b = cin.nextInt();
        try
        {
            System.out.println("a/b is " + a/b);
        }
        catch (ArithmeticException ae)
        {
            System.out.println("the denominator is zero");
        }
    }
}
