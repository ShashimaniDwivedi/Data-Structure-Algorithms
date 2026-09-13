public class Rearange {
    public static void main(String[] args) {
        // positive and negative element are equal in strength
        int[] arr = { 1, -2, 4, -5, -3, 2 };
        // 1 -2 4 -5 2 -3
        int[] pos = new int[arr.length / 2];
        int[] neg = new int[arr.length / 2];
        int k = 0, m = 0;
        for (int i : arr) {
            if (i > 0) {
                pos[k++] = i;
            } else {
                neg[m++] = i;
            }
        }
        int p = 0;
        int n = 0;

        for (int i = 0; i < arr.length / 2; i++) {
            arr[2 * i] = pos[p++];
            arr[2 * i + 1] = neg[n++];

        }

        // Print
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
