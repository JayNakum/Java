import java.util.Scanner;

public class IA1 {

    void classify(String str1, String str2) {
        final String alphabets = "abcdefghijklmnopqrstuvwxyz";
        String list1 = ""; // Common in both
        String list2 = ""; // In either of the string
        String list3 = ""; // In none
        for (int i = 0; i < alphabets.length(); i++) {
            int flg1 = 0;
            int flg2 = 0;
            
            for (int j = 0; j < str1.length(); j++) {
                if (alphabets.charAt(i) == str1.charAt(j)) {
                    flg1 = 1;
                    break;
                }
            }
            
            for (int k = 0; k < str2.length(); k++) {
                if (alphabets.charAt(i) == str2.charAt(k)) {
                    flg2 = 1;
                    break;
                }
            }

            // if both flags are 1, it means the character is common in both strings.
            if (flg1 == 1 && flg2 == 1) {
                list1 = list1 + alphabets.charAt(i);
            }
            // if any of the flag is 1 (but not both) means the character is available in only one string.
            if (flg1 == 0 && flg2 == 1) {
                list2 = list2 + alphabets.charAt(i);
            }
            if (flg1 == 1 && flg2 == 0) {
                list2 = list2 + alphabets.charAt(i);
            }
            // if both flags are 0, it means the character is not in any of the string.
            if (flg1 == 0 && flg2 == 0) {
                list3 = list3 + alphabets.charAt(i);
            }
        }
        System.out.println("Common: " + list1);
        System.out.println("Only in one: " + list2);
        System.out.println("In none: " + list3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jay Nakum (20BCP304D)");
        // Reading both Strings
        System.out.print("Enter String 1: ");
        String str1 = sc.nextLine();
        str1 = str1.toLowerCase();
        System.out.print("Enter String 2: ");
        String str2 = sc.nextLine();
        str2 = str2.toLowerCase();
        sc.close();

        new IA1().classify(str1, str2);
    }
}
