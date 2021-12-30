import java.util.Scanner;

public class P03Q08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {0, 5, 10, 15, 20};

        try {
            System.out.println("Enter two index: ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            try {
                System.out.println("Division = " + arr[x] / arr[y]);
            } catch (ArithmeticException e) {
                System.out.println("Denominator can not be zero");
                e.printStackTrace();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index bounds");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
