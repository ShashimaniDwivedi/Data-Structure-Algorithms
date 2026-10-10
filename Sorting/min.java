public class min {
    public static void main(String[] args) {
        int[] nums = { 1, 5, 90, 34, 52, 10 };
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < first) {
                third = second;
                second = first;
                first = nums[i];
            } else if (nums[i] < second) {
                third = second;
                second = nums[i];
            } else if (nums[i] < third) {
                third = nums[i];
            }

        }
        System.out.println(first + " " + second + " " + third);
    }
}