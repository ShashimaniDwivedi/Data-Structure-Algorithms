import java.util.*;

class RelativeSort {
    static public int[] relativeSort(int[] a, int[] b) {
        int[] ans = new int[a.length];

        int length = 0;
        for (int i = 0; i < a.length; i++) {
            length = Math.max(length, a[i]);
        }

        int[] count = new int[length + 1];
        for (int i = 0; i < a.length; i++) {
            count[a[i]]++;
        }

        int idx = 0;
        for (int i = 0; i < b.length; i++) {
            while (count[b[i]] > 0) {
                ans[idx++] = b[i];
                count[b[i]]--;
            }
        }
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                ans[idx++] = i;
                count[i]--;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = { 2, 3, 2, 4 };
        int[] arr2 = { 4, 3 };
        // op 4 3 2 2
        int[] res = relativeSort(arr1, arr2);
        System.out.println(Arrays.toString(res));

    }
}