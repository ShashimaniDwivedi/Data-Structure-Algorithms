public class insertRec {

    public static void insertionSort(int[] arr, int n) {

        // Base case
        if (n <= 1)
            return;

        // Sort first n-1 elements
        insertionSort(arr, n - 1);

        // Insert the nth element
        int key = arr[n - 1];
        int j = n - 2;

        // Shift larger elements to the right
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }

        // Put key at correct position
        arr[j + 1] = key;
    }

    public static void display(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = { 21, 1, 3, 5, 4, -2, 76 };

        insertionSort(arr, arr.length);

        display(arr);
    }
}