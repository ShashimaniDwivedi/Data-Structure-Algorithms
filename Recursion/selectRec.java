public class selectRec {

    public static void selectionSort(int[] arr, int n) {

        // Base case
        if (n == 1)
            return;

        // Find the largest element in first n elements
        int maxIndex = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }

        // Put largest element at the end
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[n - 1];
        arr[n - 1] = temp;

        // Sort remaining n-1 elements
        selectionSort(arr, n - 1);
    }

    public static void display(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = { 21, 1, 3, 5, 4, -2, 76 };

        selectionSort(arr, arr.length);

        display(arr);
    }
}