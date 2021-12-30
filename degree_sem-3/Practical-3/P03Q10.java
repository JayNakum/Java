import java.util.Scanner;

class InsufficientBalance extends Exception {
    @Override
    public String toString() {
        return "Not Sufficient Fund";
    }
}

public class P03Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 1000;
        int input;
        boolean flag = true;

        while (flag) {
            System.out.print("Enter the amount to withdraw: ");
            input = scanner.nextInt();
            if (balance <= 0 || input > balance) {
                try {
                    throw new InsufficientBalance();
                } catch (InsufficientBalance e) {
                    System.out.println(e);
                }
                flag = false;
            } else {
                System.out.println(input + " has been debited");
                balance = balance - input;
                System.out.println("Total balance is " + balance);
            }
        }
        scanner.close();
    }

}
