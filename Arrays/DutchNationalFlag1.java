public class DutchNationalFlag1 {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        int[] arr = { 0, 2, 1, 1, 2, 1, 0, 0, 1 };

        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {

            if (arr[mid] == 0) {
                swap(arr, mid, low);
                low++;
                mid++;

            } else if (arr[mid] == 1) {
                mid++;

            } else {
                swap(arr, mid, high);
                high--;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}