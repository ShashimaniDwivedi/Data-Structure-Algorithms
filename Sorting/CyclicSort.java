public class CyclicSort {
    // Basic element in range 1 to n
    // no duplicate
    // public static void cyclicSort(int[] nums) {

    // int i = 0;

    // while (i < nums.length) {

    // int correctIndex = nums[i] - 1;

    // if (nums[i] != nums[correctIndex]) {

    // int temp = nums[i];
    // nums[i] = nums[correctIndex];
    // nums[correctIndex] = temp;

    // } else {
    // i++;
    // }
    // }
    // }
    // Modified Cyclic sort for out of range element
    // does not sort element out of range
    public static void cyclicSort(int[] nums) {

        int i = 0;

        while (i < nums.length) {

            int correctIndex = nums[i] - 1;

            if (nums[i] >= 1 &&
                    nums[i] <= nums.length &&
                    nums[i] != nums[correctIndex]) {

                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;

            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 1 };
        cyclicSort(nums);
        for (int i : nums)
            System.out.print(i + " ");
    }
}