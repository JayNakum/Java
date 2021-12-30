package Practical_List_3;

import java.util.Scanner;

class InsufficientBalance extends Exception {
    @Override
    public String toString() {
        return "Not Sufficient Fund";
    }
}

public class Que_10 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int balance = 1000;
        boolean flag = true;

        while (flag) {
            System.out.println("Enter the amount for withdraw");
            int input = cin.nextInt();
            if (balance <= 0 || input > balance) {
                try {
                    throw new InsufficientBalance();
                } catch (InsufficientBalance e) {
                    System.out.println(e);
                }
                flag = false;
            } else {
                System.out.println(input + " has been Debited");
                balance = balance - input;
                System.out.println("Balance is " + balance);
            }
        }
    }

}


