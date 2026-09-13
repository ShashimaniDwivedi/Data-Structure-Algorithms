
import java.util.Arrays;

public class TwoSum2 {

    public static void main(String[] args) {

        int target = 5;
        int[] a = {1, 2, 3, 5, 4};

        Arrays.sort(a);

        int left = 0;
        int right = a.length - 1;

        while (left < right) {

            int sum = a[left] + a[right];

            if (sum == target) {
                System.out.println(a[left] + " " + a[right]);
                break;
            }

            else if (sum < target) {
                left++;
            }

            else {
                right--;
            }
        }
    }
}