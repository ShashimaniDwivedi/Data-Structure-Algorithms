public class MergeSort1 {

    public static void mergeProcedure(int[] arr, int low, int mid, int high) {

        int i = low;
        int j = mid + 1;
        int k = 0;

        int[] temp = new int[high - low + 1];

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

        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while (j <= high) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // Copy sorted values back into original array
        for (int x = 0; x < temp.length; x++) {
            arr[low + x] = temp[x];
        }
    }

    public static void mergeSort(int[] arr, int low, int high) {

        if (low < high) {

            int mid = low + (high - low) / 2;

            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);

            mergeProcedure(arr, low, mid, high);
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 3, -1, 0, 33, 54, 67};

        System.out.println("Array Before Sorting");

        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Array After Sorting");

        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}