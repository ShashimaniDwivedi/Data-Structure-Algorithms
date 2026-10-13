import java.util.*;

public class longestArraySum {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 1, 1, 1, 1, 4, 2, 3 };
        int k = 3;

       
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            // If sum itself is k
            if (sum == k) {
                maxLen = i + 1;
            }

            // Check if there is a previous prefix sum
            if (map.containsKey(sum - k)) {
                int len = i - map.get(sum - k);
                maxLen = Math.max(maxLen, len);
            }

           
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        System.out.println("Longest subarray length = " + maxLen);
    }
}