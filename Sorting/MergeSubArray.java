// package Sorting;

public class MergeSubArray {

    public static void main(String[] args) {

        int[] arr = {1, 12, 13, 14, 15, 5, 6, 7, 8};
        int[] temp = new int[arr.length];

        int low = 0;
        int high = arr.length;
        int mid = low + (high - low) / 2;

        int i = low;
        int j = mid + 1;
        int k = 0;

        // Merge both sorted subarrays
        while (i <= mid && j < high) {

            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }

            k++;
        }

        // Remaining elements from left subarray
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        // Remaining elements from right subarray
        while (j < high) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // Copy temp back to arr
        for (int x = 0; x < arr.length; x++) {
            arr[x] = temp[x];
        }

        // Print
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}