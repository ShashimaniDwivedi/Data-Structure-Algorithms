public class nextPermutation {

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    static int[] nextPer(int[] nums) {
        int n = nums.length;
        int idx = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                idx = i;
                break;
            }
        }

        if (idx == -1) {
            return reverse(nums, 0, n - 1);
        }

        for (int i = n - 1; i > idx; i--) {
            if (nums[i] > nums[idx]) {
                swap(nums, i, idx);
                break;
            }
        }

        return reverse(nums, idx + 1, n - 1);
    }

    static int[] reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
        return nums;
    }

    public static void main(String[] args) {

        int[] nums = { 1, 4, 7, 6 };

        nums = nextPer(nums);

        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}