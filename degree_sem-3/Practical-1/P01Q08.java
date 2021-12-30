/* Create a class which ask the user to enter a sentence, and it should display count of each vowel type in the sentence. 
The program should continue till user enters a word "quit". 
Display the total count of each vowel for all sentences.
*/

import java.util.Scanner;

class Count {
    private String str;
    private int length;
    private int a = 0, e = 0, i = 0, o = 0, u = 0;

    Count(String str) {
        this.str = str;
        calculate();
    }

    void calculate() {
        length = str.length();
        str = str.toLowerCase();
        for (int count = 0; count < length; count++) {
            if (str.charAt(count) == 'a') {
                a += 1;
            }
            if (str.charAt(count) == 'e') {
                e += 1;
            }
            if (str.charAt(count) == 'i') {
                i += 1;
            }
            if (str.charAt(count) == 'o') {
                o += 1;
            }
            if (str.charAt(count) == 'u') {
                u += 1;
            }
        }
        System.out.println("a = " + a);
        System.out.println("e = " + e);
        System.out.println("i = " + i);
        System.out.println("o = " + o);
        System.out.println("u = " + u);
    }
}

public class P01Q08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            str = null;
            System.out.print("Enter a line: ");
            str = sc.nextLine();
            if (str.equalsIgnoreCase("quit")) {
                break;
            }
            new Count(str);
        }
        sc.close();
    }
}
