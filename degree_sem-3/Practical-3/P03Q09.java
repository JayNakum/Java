import java.util.Scanner;

class AgeException extends Exception{
    private String message = "You are not eligible :(\nYou need to be atleast 12yrs old";
    public void printMessage(String message) {
        if(!message.isEmpty()) {
            this .message = message;
        }
        System.err.println(this.message);
    }
}

public class P03Q09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.close();
        try {
            if (age < 12) {
                throw new AgeException();
            }
            else {
                System.out.println("You are old enough!");
            }
        } catch(AgeException e) {
            final String msg = "";
            e.printMessage(msg);
        }
    }
}
