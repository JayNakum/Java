/* Write a program to accept a line and check how many consonants and vowels are there in line.
*/

import java.util.Scanner;

public class P01Q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a line: ");
        String str = sc.nextLine();
        sc.close();

        int length = str.length();
        int vowel = 0;
        int consonants = 0;

        str = str.trim();
        str = str.toLowerCase();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                vowel += 1;
            }
        }
        consonants = length - vowel;

        System.out.println("Vowels = " + vowel);
        System.out.println("Consonants = " + consonants);
    }
}
