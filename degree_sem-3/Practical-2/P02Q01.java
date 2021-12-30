import java.util.Scanner;

class Distance {

    double distanceInFoot(int x, int y) {
        double dist = Math.sqrt(x * x + y * y);
        dist *= 3.28084;
        return dist;
    }

    double distanceInInches(int x, int y) {
        double dist = Math.sqrt(x * x + y * y);
        dist *= 39.3701;
        return dist;
    }
}

public class P02Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x coordinates: ");
        int x = sc.nextInt();
        System.out.print("Enter the value of y coordinates: ");
        int y = sc.nextInt();
        sc.close();

        Distance obj = new Distance();
        System.out.println("The distance in foot is : " + obj.distanceInFoot(x, y) + " ft");
        System.out.println("The distance in inches is : " + obj.distanceInInches(x, y) + " inches");
        
    }
}
