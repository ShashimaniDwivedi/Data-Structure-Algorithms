/* public class leader {
    public static void main(String[] args) {

        int[] arr = { 10, 22, 12, 3, 0, 6 };
         //right me sare element bade hone chahiye
         //22 12 6
        for (int i = 0; i < arr.length; i++) {

            boolean leader = true;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] < arr[j]) {
                    leader = false;
                    break;
                }
            }

            if (leader) {
                System.out.print(arr[i] + " ");
            }
        }
    }
} */

public class leader {
    public static void main(String[] args) {

        int[] arr = { 10, 22, 12, 3, 0, 6 };

        int max = arr[arr.length - 1];

        System.out.print(max + " ");

        for (int i = arr.length - 2; i >= 0; i--) {

            if (arr[i] > max) {
                max = arr[i];
                System.out.print(max + " ");
            }
        }
    }
}