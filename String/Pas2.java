public class Pas2 {
    public static void main(String[] args) {
        int n = 5;

        int[][] nums = new int[n][n];

        nums[0][0] = 1;
        nums[1][0] = 1;
        nums[1][1] = 1;

        for (int i = 2; i < nums.length; i++) {
            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i) {
                    nums[i][j] = 1;
                } else {
                    nums[i][j] = nums[i - 1][j - 1] + nums[i - 1][j];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

    }
}
