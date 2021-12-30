import java.util.Scanner;

class P03Q11 {
    public static int binarySearch(int[] arr, int n, int key) {
        int low = 0;
        int high = n - 1;
        try {
            while (low <= high) {
                int mid = (low + high) / 2;
                if (arr[mid] == key) {
                    return mid;
                } else if (arr[mid] > key) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("Array Index is out of bound :/");
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;
        System.out.print("Enter the element: ");
        int element = scanner.nextInt();
        int index = binarySearch(arr, n, element);
        if (index != -1) {
            System.out.println("Element found at " + index);
        } else {
            System.out.println("Element not found");
        }
        scanner.close();
    }
}
