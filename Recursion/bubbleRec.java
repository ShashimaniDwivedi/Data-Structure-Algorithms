public class bubbleRec {

    public static void bubble(int[] arr, int n) {

        // Base case
        if (n == 1)
            return;

        for (int j = 0; j < n - 1; j++) {

            if (arr[j] > arr[j + 1]) {

                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }

        // Sort remaining n-1 elements
        bubble(arr, n - 1);
    }

    public static void display(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = { 21, 1, 3, 5, 4, -2, 76 };

        bubble(arr, arr.length);

        display(arr);
    }
}