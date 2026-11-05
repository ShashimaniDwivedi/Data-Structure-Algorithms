import java.util.*;

class CountingSort {
    public static void main(String[] args) {

        int[] arr = { 4, 2, 2, 8, 3, 3, 1 };

        // Find maximum element
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        // Create frequency array
        int[] count = new int[max + 1];

        // Count frequency
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Reconstruct sorted array
        int index = 0;

        for (int i = 0; i < count.length; i++) {

            while (count[i] > 0) {
                arr[index] = i;
                index++;
                count[i]--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}