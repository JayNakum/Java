package Practical_List_3;

import java.util.Scanner;

public class Que_8 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int [] arr = new int[5];
        arr[0] = 5;
        arr[2] = 45;
        arr[1] = 12;
        arr[3] = 0;
        arr[4] = 12;

        try{
            System.out.println("Enter that two index");
            int x = cin.nextInt();
            int y = cin.nextInt();
            int t1 = arr[x];
            int t2 = arr[y];
            try
            {
                System.out.println("the division is " + t1/t2);
            }
            catch (ArithmeticException ae)
            {
                System.out.println("Cant divide by that element");
            }
        }
        catch (ArrayIndexOutOfBoundsException ai)
        {
            System.out.println("Array index bounds");
        }

    }
}
