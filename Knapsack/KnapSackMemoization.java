
import java.util.Arrays;

public class KnapSackMemoization {

    public static int knapsack(int[] wt, int[] val, int W, int n, int[][] dp) {

        // Base case
        if (n == 0 || W == 0) {
            return 0;
        }

        // If already calculated
        if (dp[n][W] != -1) {
            return dp[n][W];
        }

        // If current item cannot fit
        if (wt[n - 1] > W) {
            return dp[n][W] = knapsack(wt, val, W, n - 1, dp);
        }

        // Include current item
        int include = val[n - 1]
                + knapsack(wt, val, W - wt[n - 1], n - 1, dp);

        // Exclude current item
        int exclude = knapsack(wt, val, W, n - 1, dp);

        // Store and return the maximum
        return dp[n][W] = Math.max(include, exclude);
    }

    public static void main(String[] args) {

        int[] wt = { 1, 3, 4, 5 };
        int[] val = { 1, 4, 5, 7 };
        int W = 7;
        int n = wt.length;

        int[][] dp = new int[n + 1][W + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        System.out.println(knapsack(wt, val, W, n, dp));
    }
}
