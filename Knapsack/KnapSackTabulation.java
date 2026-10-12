
public class KnapSackTabulation {

    public static int knapsack(int[] wt, int[] val, int W, int n) {

        int[][] dp = new int[n + 1][W + 1];

        // Base cases: dp[i][0] = 0 and dp[0][j] = 0
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }

        for (int j = 0; j <= W; j++) {
            dp[0][j] = 0;
        }

        // Fill the DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= W; j++) {

                // Current item weight
                if (wt[i - 1] <= j) {

                    int include = val[i - 1]
                            + dp[i - 1][j - wt[i - 1]];

                    int exclude = dp[i - 1][j];

                    dp[i][j] = Math.max(include, exclude);

                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][W];
    }

    public static void main(String[] args) {

        int[] wt = { 1, 3, 4, 5 };
        int[] val = { 1, 4, 5, 7 };

        int W = 7;

        System.out.println(knapsack(wt, val, W, wt.length));
    }
}
