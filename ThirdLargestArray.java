import java.util.Scanner;
public class ThirdLargestArray {
      public static int findThirdLargest(int[] arr) {
        if (arr.length < 3) {
            System.out.println("Array size is less than 3.");
            return Integer.MIN_VALUE;
        }

        int[] maxValues = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        findThirdLargestHelper(arr, 0, maxValues);

        return maxValues[2];
    }

    private static void findThirdLargestHelper(int[] arr, int index, int[] maxValues) {
        if (index == arr.length)
            return;

        if (arr[index] > maxValues[0]) {
            maxValues[2] = maxValues[1];
            maxValues[1] = maxValues[0];
            maxValues[0] = arr[index];
        } else if (arr[index] > maxValues[1]) {
            maxValues[2] = maxValues[1];
            maxValues[1] = arr[index];
        } else if (arr[index] > maxValues[2]) {
            maxValues[2] = arr[index];
        }

        findThirdLargestHelper(arr, index + 1, maxValues);
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

        int thirdLargest = findThirdLargest(arr);
        System.out.println("The third largest element is: " + thirdLargest);
   scanner.close();
    }
}
