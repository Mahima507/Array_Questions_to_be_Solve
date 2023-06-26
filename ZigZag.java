public class ZigZag {

    public static void main(String[] args) {
        int ar[] = { 4, 3, 7, 8, 6, 2, 1 };
        int n = ar.length;
        for (int i = 0; i < n - 1; i++) {
            if (i % 2 == 0) {
                if (ar[i] < ar[i + 1])
                    continue;
                else {
                    int temp = ar[i];
                    ar[i] = ar[i + 1];
                    ar[i + 1] = temp;
                }
            } else {
                if (ar[i] > ar[i + 1])
                    continue;
                else {
                    int temp = ar[i];
                    ar[i] = ar[i + 1];
                    ar[i + 1] = temp;
                }
            }
        }
        for (int a : ar)
            System.out.print(a + " ");
    }

}
