public class DutchFlag {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 2, 2, 0, 1, 0 };
        int n = arr.length;
        int l = 0, m = 0, r = n - 1;
        while (m <= r) {
            if (arr[m] == 0) {
                int temp = arr[m];
                arr[m] = arr[l];
                arr[l] = temp;
                m++;
                l++;
            } else if (arr[m] == 2) {
                int temp = arr[m];
                arr[m] = arr[r];
                arr[r] = temp;
                r--;
            } else {
                m++;
            }
        }
        for (int e : arr) {
            System.out.println(e + " ");
        }
    }
}
