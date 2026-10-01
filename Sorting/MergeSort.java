

public class MergeSort {

    static void mergeSort(int[] arr, int low, int high) {

        if (low >= high) {
            return;
        }

        int mid = low + (high - low) / 2;

        // Divide
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);

        // Merge
        merge(arr, low, mid, high);
    }

    static void merge(int[] arr, int low, int mid, int high) {

        int[] temp = new int[high - low + 1];

        int i = low;       // left subarray
        int j = mid + 1;   // right subarray
        int k = 0;

        while (i <= mid && j <= high) {

            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }

            k++;
        }

        // Remaining elements of left subarray
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        // Remaining elements of right subarray
        while (j <= high) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // Copy temp back to original array
        for (i = low, k = 0; i <= high; i++, k++) {
            arr[i] = temp[k];
        }
    }

    static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {12, 11, 13, 5, 6, 7};

        mergeSort(arr, 0, arr.length - 1);

        printArray(arr);
    }
}