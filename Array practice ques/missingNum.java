
public class missingNum {
    int missingNumber(int array[], int n) {
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            sum += array[i];
        }
        int val = n * (n + 1) / 2;
        return val - sum;
    }

    public static void main(String[] args) {

    }
}
