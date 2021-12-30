import java.util.Arrays;
import java.util.Scanner;

class IA1 {
    private String str;
    private String alphabets = "", digits = "", characters = "";
    private String removeDuplicateAlphabets = "", removeDuplicateDigits = "";
    private String sortedAlphabets, sortedDigits;

    public IA1(String str) {
        this.str = str.toLowerCase();
        seperate();
        removeDuplicateAlphabets();
        removeDuplicateDigits();
        sort();
        display();
    }

    void seperate() {
        final String alphabets = "abcdefghijklmnopqrstuvwxyz";
        final String digits = "0123456789";
        final String characters = "!@#$%^&*()_-+={}[]|:;?,.";

        for (int index = 0; index < this.str.length(); index++) {
            for (int i = 0; i < alphabets.length(); i++) {
                if (this.str.charAt(index) == alphabets.charAt(i)) {
                    this.alphabets += this.str.charAt(index);
                }
            }
            for (int j = 0; j < digits.length(); j++) {
                if (this.str.charAt(index) == digits.charAt(j)) {
                    this.digits += this.str.charAt(index);
                }
            }
            for (int k = 0; k < characters.length(); k++) {
                if (this.str.charAt(index) == characters.charAt(k)) {
                    this.characters += this.str.charAt(index);
                }
            }
        }
        // System.out.println("Alphabets: " + this.alphabets);
        // System.out.println("Digits: " + this.digits);
        // System.out.println("Characters: " + this.characters);
    }

    void removeDuplicateAlphabets() {
        char[] alpha = new char[this.alphabets.length()];
        int index = 0;
        for (int i = 0; i < this.alphabets.length(); i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (this.alphabets.charAt(i) == this.alphabets.charAt(j)) {
                    break;
                }
            }
            if (j == i) {
                alpha[index++] += this.alphabets.charAt(i);
            }
        }
        for(int c = 0 ; c < alpha.length ; c++) {
            this.removeDuplicateAlphabets += alpha[c];
        }
        // System.out.println("Removed duplicates Alphabets: " + this.removeDuplicateAlphabets);
    }
    void removeDuplicateDigits() {
        char[] dig = new char[this.digits.length()];
        int index = 0;
        for (int i = 0; i < this.digits.length(); i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (this.digits.charAt(i) == this.digits.charAt(j)) {
                    break;
                }
            }
            if (j == i) {
                dig[index++] += this.digits.charAt(i);
            }
        }
        for(int c = 0 ; c < dig.length ; c++) {
            this.removeDuplicateDigits += dig[c];
        }
        // System.out.println("Removed duplicates Digits: " + this.removeDuplicateDigits);
    }

    void sort() {
        char tempArray1[] = this.removeDuplicateAlphabets.toCharArray();
        Arrays.sort(tempArray1);
        this.sortedAlphabets = new String(tempArray1);

        char tempArray2[] = this.removeDuplicateDigits.toCharArray();
        Arrays.sort(tempArray2);
        this.sortedDigits = new String(tempArray2);

        // System.out.println("Sorted Alphabets: " + this.sortedAlphabets);
        // System.out.println("Sorted Digits: " + this.sortedDigits);
    }

    void display() {
        final String alphabets = "abcdefghijklmnopqrstuvwxyz";
        final String digits = "0123456789";
        System.out.println(this.sortedAlphabets);
        for(int i = 0 ; i < alphabets.length() ; i ++) {
            for(int a = 0 ; a < this.sortedAlphabets.length() ; a++) {
                if(alphabets.charAt(i) == sortedAlphabets.charAt(a)){
                    break;
                }
                System.out.print(sortedAlphabets.charAt(a));
            }
        }

        System.out.println(this.sortedDigits);
        for(int i = 0 ; i < digits.length() ; i ++) {
            for(int a = 0 ; a < this.sortedDigits.length() ; a++) {
                if(digits.charAt(i) == sortedDigits.charAt(a)){
                    break;
                }
                System.out.print(sortedDigits.charAt(a));
            }
        }

        System.out.println(this.characters);
    }

}

public class JayNakum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // String str = in.next();
        in.close();
        // System.out.println("You entered: " + str);
        new IA1("aaabc#@1123");
    }
}
