public class Binary {
    public static int search(int[] arr, int x, int low, int high) {

    if (low > high) {
        return -1;
    }

    int mid = low + (high - low) / 2;

    if (arr[mid] == x) {
        return mid;
    }
    else if (arr[mid] > x) {
        return search(arr, x, low, mid - 1);
    }
    else {
        return search(arr, x, mid + 1, high);
    }
}

    public static void main(String[] args) {
         int[]arr={12,33,45,67,89};
        System.out.printf("Element found at index %d",search(arr,23,0,arr.length-1));
    }
}
