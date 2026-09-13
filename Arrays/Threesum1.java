import java.util.*;

public class Threesum1 {

    public static void main(String[] args) {

        int[] arr = { -1, 0, 1, 2, -1, -4 };

        Arrays.sort(arr);

        int n = arr.length;

        Set<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < n ; i++) {

            int left = i + 1;
            int right = n - 1;

            while (left < right) {

                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {

                    result.add(Arrays.asList(
                            arr[i],
                            arr[left],
                            arr[right]));

                    left++;
                    right--;

                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        System.out.println(result);
    }
}