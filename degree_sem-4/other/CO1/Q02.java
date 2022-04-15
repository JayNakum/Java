package CO1;
public class Q02 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        String o = args[1];
        int b = Integer.parseInt(args[2]);
        int result = 0;
        switch (o) {
            case "+":
                result = a + b;
                break;
            
            case "-":
                result = a - b;

            case "*":
                result = a * b;
            case "/":
                try {
                    result = a / b;
                } catch (ArithmeticException e) {
                    e.printStackTrace();
                }
            default:
                System.out.println("Invalid input " + o);
                break;
        }
        System.out.println(a + " " + o + " " + b + " = " + result);
    }
}
