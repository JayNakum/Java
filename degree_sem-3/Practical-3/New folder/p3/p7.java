package p3;
public class p7 {
  public static void main(String args[]) {

    int a, b,c;

    try {

      a=15;
      b=0;
      c=a/b;

      System.out.println("in try block");

    }

    catch (ArithmeticException e) {

      System.out.println("Division by zero not Possible!");

    }

    System.out.println("out of try block");
  }

}