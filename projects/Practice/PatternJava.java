/*
    J     A     V     V     A
    J    A A     V   V     A A
J   J   AAAAA     V V     AAAAA
 J J   A     A     V     A     A
*/

public class PatternJava {

    PatternJava() {
        printJ();
        System.out.println();
        printA();
        System.out.println();
        printV();
        System.out.println();
        printA();
    }

    void printA() {
        int totalRows = 4;
        int totalColumns = 6;
        int n = totalColumns / 2;
        for (int row = 0; row < totalRows; row++) {
            for (int col = 0; col <= totalColumns; col++) {
                if (col == n || col == (totalColumns - n)
                        || (row == totalRows / 2 && col > n && col < (totalColumns - n)))
                    System.out.print("A");
                else
                    System.out.print(" ");
            }
            System.out.println();
            n--;
        }
    }

    void printJ() {
        int totalRows = 4;
        int i, j;
        for (i = 0; i < totalRows; i++) {
            for (j = 0; j < totalRows; j++) {
                if (i == totalRows - 1 && (j > 0 && j < totalRows - 1))
                    System.out.print("J");
                else if ((j == totalRows - 1 && i != totalRows - 1)
                        || (i > (totalRows / 2) - 1 && j == 0 && i != totalRows - 1))
                    System.out.print("J");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    void printV() {
        int totalRows = 4;
        int totalColumns = 7;
        int i, j, counter = 0;
        for (i = 0; i < totalRows; i++) {
            for (j = 0; j <= totalColumns; j++) {
                if (j == counter || j == totalColumns - counter - 1)
                    System.out.print("V");
                else
                    System.out.print(" ");
            }
            counter++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new PatternJava();
    }
}