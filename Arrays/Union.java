public class Union {

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 4, 5};
        int[] arr1 = {2, 3, 4, 4, 5};

        int[] union = new int[arr.length + arr1.length];

        int res = 0;

        // Add unique elements of arr
        for (int i = 0; i < arr.length; i++) {

            int found = 0;

            for (int j = 0; j < res; j++) {

                if (arr[i] == union[j]) {
                    found = 1;
                    break;
                }
            }

            if (found == 0) {
                union[res] = arr[i];
                res++;
            }
        }

        // Add unique elements of arr1
        for (int i = 0; i < arr1.length; i++) {

            int found = 0;

            for (int j = 0; j < res; j++) {

                if (arr1[i] == union[j]) {
                    found = 1;
                    break;
                }
            }

            if (found == 0) {
                union[res] = arr1[i];
                res++;
            }
        }

        // Print union
        for (int i = 0; i < res; i++) {
            System.out.print(union[i] + " ");
        }
    }
}