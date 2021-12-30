public class P03Q07 {
    public static void main(String[] args) {
        int a = 12, b = 0;
        try {
            int c = a / b;
            System.out.println("Division = " + c);
        } catch(ArithmeticException e) {
            System.out.println("Denominator can not be zero");
            e.printStackTrace();
        }
    }
}
