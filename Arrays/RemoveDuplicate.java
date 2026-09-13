public class RemoveDuplicate {

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] removeDup(int[] arr) {

        int[] temp = new int[arr.length];
        int res = 0;

        for (int i = 0; i < arr.length; i++) {

            boolean found = false;

            // Check if arr[i] already exists
            for (int j = 0; j < res; j++) {

                if (arr[i] == temp[j]) {
                    found = true;
                    break;
                }
            }

            // If not found, add it
            if (!found) {
                temp[res] = arr[i];
                res++;
            }
        }

        // Create result array of exact size
        int[] result = new int[res];

        for (int i = 0; i < res; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    // public static int[] removeDup(int[] arr) {

    // int res = 1;

    // for (int i = 1; i < arr.length; i++) {

    // if (arr[i] != arr[res - 1]) {
    // arr[res] = arr[i];
    // res++;
    // }
    // }

    // int[] result = new int[res];

    // for (int i = 0; i < res; i++) {
    // result[i] = arr[i];
    // }

    // return result;
    // }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 2, 3, 4, 5, 5, 6, 6, 7, 7 };

        arr = removeDup(arr);

        print(arr);
    }
}