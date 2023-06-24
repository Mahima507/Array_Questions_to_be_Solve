
import java.util.Scanner;

public class NthLargestElement {

    public static int findNthLargest(int[] arr, int n) {
        if (arr.length < n) {
            System.out.println("Array size is less than " + n + ".");
            return Integer.MIN_VALUE;
        }

        int[] maxValues = new int[n];
        for (int i = 0; i < n; i++) {
            maxValues[i] = Integer.MIN_VALUE;
        }

        findNthLargestHelper(arr, 0, maxValues);

        return maxValues[n - 1];
    }

    private static void findNthLargestHelper(int[] arr, int index, int[] maxValues) {
        if (index == arr.length)
            return;

        int value = arr[index];
        if (value > maxValues[0]) {
            for (int i = 0; i < maxValues.length - 1; i++) {
                maxValues[i] = maxValues[i + 1];
            }
            maxValues[maxValues.length - 1] = value;
        } else if (value > maxValues[maxValues.length - 1]) {
            for (int i = 0; i < maxValues.length - 1; i++) {
                if (value > maxValues[i] && value <= maxValues[i + 1]) {
                    for (int j = maxValues.length - 2; j > i; j--) {
                        maxValues[j + 1] = maxValues[j];
                    }
                    maxValues[i + 1] = value;
                    break;
                }
            }
        }

        findNthLargestHelper(arr, index + 1, maxValues);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        int nthLargest = findNthLargest(arr, n);
        System.out.println("The " + n + "th largest element is: " + nthLargest);
      scanner.close();
    }
}

