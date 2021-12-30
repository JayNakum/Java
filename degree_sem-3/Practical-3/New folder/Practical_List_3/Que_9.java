package Practical_List_3;

import java.util.Scanner;

class myAgeException extends Exception{
    @Override
    public String toString() {
        return "Age can't be minus , zero or greater than 125";
    }
}

public class Que_9 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter Your age : ");
        boolean flag = true;
        while(flag) {
            int age = cin.nextInt();
            if (age <= 0 || age > 125) {
                try {
                    throw new myAgeException();
                } catch (Exception e) {
                    System.out.println("Error: " + e);
                    System.out.println(e.toString());
                }
            } else {
                System.out.println("Age is valid now");
                flag = false;
            }
        }
    }
}
