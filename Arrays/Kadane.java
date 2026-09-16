/* public class Kadane {

    public static void main(String[] args) {

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            int sum = 0;

            for (int j = i; j < arr.length; j++) {

                sum += arr[j];

                maxSum = Math.max(maxSum, sum);
            }
        }

        System.out.println("Maximum Subarray Sum = " + maxSum);
    }
} */

public class Kadane {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        int maxSum = Integer.MIN_VALUE;
        int ans = 7;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            maxSum = Math.max(maxSum, sum);
        if (sum < 0)
                sum = 0;
        }
            System.out.print(maxSum);
    }
}
