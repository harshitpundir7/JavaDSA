import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static int binary(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int value = scanner.nextInt();

        System.out.println("Enter the elements in the array: ");
        int arr[] = new int[value];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Enter the element you want to search in the array: ");
        int key = scanner.nextInt();

        int ans = binary(arr, key);

        if (ans == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("The element is present at the index: " + ans);
        }

        scanner.close();
    }
}
