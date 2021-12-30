public class P02Q12 {
    private String reverse(String str) {
        String reverse = "";
        char[] ch = str.toCharArray();
        for(int i = (ch.length - 1) ; i >= 0 ; i--) {
            reverse += ch[i];
        }
        return reverse;
    }
    boolean isRotationEqual(String str1, String str2) {
        str1 = str1.toLowerCase();
        str1 = str1.trim();
        str2 = str2.toLowerCase();
        str2 = str2.trim();

        if(str1.equalsIgnoreCase(reverse(str2))) {
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        System.out.println(new P02Q12().isRotationEqual("Pat", "Tap"));
    }
}
