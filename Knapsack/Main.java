
public class Main {

    public static int knapsack(int[] wt, int[] val, int W, int n) {

        // Base case
        if (n == 0 || W == 0) {
            return 0;
        }

        // If current item weight exceeds capacity
        if (wt[n - 1] > W) {
            return knapsack(wt, val, W, n - 1);
        }

        // Two choices: include or exclude
        int include = val[n - 1]
                + knapsack(wt, val, W - wt[n - 1], n - 1);

        int exclude = knapsack(wt, val, W, n - 1);

        return Math.max(include, exclude);
    }

    public static void main(String[] args) {

        int[] wt = { 1, 3, 4, 5 };
        int[] val = { 1, 4, 5, 7 };

        int W = 7;

        System.out.println(knapsack(wt, val, W, wt.length));
    }
}
