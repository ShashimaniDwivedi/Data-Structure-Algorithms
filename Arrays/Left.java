public class Left {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int d = 2;
        int[] temp = new int[2];
        for(int i=0;i<d;i++){
            temp[i]=arr[i];
        }
        for (int i = d; i < arr.length; i++) {
            arr[i - d] = arr[i];
        }
        for (int i = 0; i < temp.length; i++) {
            arr[arr.length - d + i] = temp[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}

/*
 * public class Left {
 * public static void rev(int[] arr, int i, int j) {
 * while (i < j) {
 * int temp = arr[i];
 * arr[i] = arr[j];
 * arr[j] = temp;
 * i++;
 * j--;
 * }
 * }
 * 
 * public static void main(String[] args) {
 * int[] arr = { 1, 2, 3, 4, 5, 6 };
 * // 2 1 6 5 4 3
 * // 3 4 5 6 1 2
 * int n = 2;
 * int d = n % 6;
 * rev(arr, 0, d - 1);
 * rev(arr, d, arr.length - 1);
 * rev(arr, 0, arr.length - 1);
 * for (int i = 0; i < arr.length; i++) {
 * System.out.print(arr[i] + " ");
 * }
 * }
 * 
 * }
 */