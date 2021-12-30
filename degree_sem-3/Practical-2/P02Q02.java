import java.util.Scanner;

class Distances {
    public int x, y;

    Distances(int x, int y) {
        this.x = x;
        this.y = y;
    }
    Distances(Distances obj) {
        this.x = obj.x;
        this.y = obj.y;
    }

    double distanceInFoot() {
        double dist = Math.sqrt(x * x + y * y);
        dist *= 3.28084;
        return dist;
    }

    double distanceInInches() {
        double dist = Math.sqrt(x * x + y * y);
        dist *= 39.3701;
        return dist;
    }
}

public class P02Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x coordinates: ");
        int x = sc.nextInt();
        System.out.print("Enter the value of y coordinates: ");
        int y = sc.nextInt();
        sc.close();

        Distances obj1 = new Distances(x, y);
        System.out.println("The distance in foot is : " + obj1.distanceInFoot() + " ft");
        System.out.println("The distance in inches is : " + obj1.distanceInInches() + " inches");

        Distances obj2 = new Distances(obj1);
        System.out.println("x = " + obj2.x);
        System.out.println("y = " + obj2.y);
    }
}
