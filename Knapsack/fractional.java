
import java.util.*;

class Item {
    int weight;
    int value;

    Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
}

class Solution {

    public static double fractionalKnapsack(int W, Item[] arr, int n) {

        // Sort by value/weight ratio in descending order
        Arrays.sort(arr, (a, b) -> Double.compare(
                (double) b.value / b.weight,
                (double) a.value / a.weight));

        double totalProfit = 0;

        for (int i = 0; i < n; i++) {

            if (arr[i].weight <= W) {

                totalProfit += arr[i].value;
                W -= arr[i].weight;

            } else {

                double fraction = (double) W / arr[i].weight;

                totalProfit += arr[i].value * fraction;

                break;
            }
        }

        return totalProfit;
    }
}

class fractional {
    public static void main(String[] args) {

        int W = 90;

        Item[] arr = {
                new Item(10, 60),
                new Item(50, 100),
                new Item(20, 100),
                new Item(50, 200)
        };

        int n = arr.length;

        double ans = Solution.fractionalKnapsack(W, arr, n);

        System.out.println("Maximum Profit: " + ans);
    }
}
