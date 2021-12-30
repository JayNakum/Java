/* Write a program in Java to sort the elements of list so that they are in ascending order.
*/

import java.util.Scanner;

class Sorting {
    private int[] array;

    Sorting(int[] array) {
        this.array = array;
    }

    int[] ascending() {
        int temp = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = (i + 1); j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }

}

public class P01Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int list[] = new int[5];

        System.out.println("Enter 5 numbers: ");
        for (int a = 0; a < list.length; a++) {
            list[a] = sc.nextInt();
        }
        sc.close();

        Sorting obj = new Sorting(list);
        list = obj.ascending();

        System.out.println("Ascending order: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(" " + list[i]);
        }
    }
}
