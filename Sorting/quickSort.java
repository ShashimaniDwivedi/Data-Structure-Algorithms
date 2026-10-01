public class quickSort {
    public static void quickSort1(int[] arr, int l, int h) {
        if (l < h) {
            // Dividing the array into subProblem
            // get pivot
            int m = partition(arr, l, h);
            // Conquer those sub problem via recursion
            quickSort1(arr, l, m - 1);
            quickSort1(arr, m + 1, h);
        }
    }

    public static int partition(int[] arr, int l, int h) {
        int i = l;
        // pivot as the first element in an array
        int pivot = arr[l];
        for (int j = l + 1; j <= h; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // to return pivot to its original position
        int temp1 = arr[l];
        arr[l] = arr[i];
        arr[i] = temp1;
        return i;
    }

    public static void printArr(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 50, 20, 40, 90, 88, 11, 13 };
        int n = arr.length;
        System.out.println("Array Before Sorting is : ");
        printArr(arr, n);
        quickSort1(arr, 0, n - 1);
        System.out.println("Array After Sorting is : ");
        printArr(arr, n);
    }
}