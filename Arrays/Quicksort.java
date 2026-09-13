public class Quicksort {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int low, int high) {

        int pivot = arr[low];

        int i = low;

        for (int j = low + 1; j <= high; j++) {

            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        // Put pivot at its correct position
        swap(arr, low, i);

        return i;
    }

    public static void quick(int[] arr, int low, int high) {

        if (low < high) {

            int pivotPos = partition(arr, low, high);

            quick(arr, low, pivotPos - 1);

            quick(arr, pivotPos + 1, high);
        }
    }

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = { 50, 40, 30, 20, 70, 90, 10 };

        System.out.println("Before sorting:");
        print(arr);

        quick(arr, 0, arr.length - 1);

        System.out.println("After sorting:");
        print(arr);
    }
}