import java.util.*;

//TC =O(2^n)
//SC =O(n * 2^n)Auxilarry
public class SubsetTwo {

    public static void subset(int[] nums,
            ArrayList<ArrayList<Integer>> res,
            ArrayList<Integer> tmp,
            int idx) {

        if (idx == nums.length) {
            res.add(new ArrayList<>(tmp));
            return;
        }
        // include 1 path
        tmp.add(nums[idx]);

        subset(nums, res, tmp, idx + 1);

        // not include 2 path
        tmp.remove(tmp.size() - 1);
        int i = idx + 1;
        while (i < nums.length && nums[i] == nums[i - 1])
            i++;

        subset(nums, res, tmp, i);
    }

    public static void main(String[] args) {

        int[] nums = { 1, 2, 3, 2 };

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> tmp = new ArrayList<>();
        Arrays.sort(nums);
        subset(nums, res, tmp, 0);

        System.out.println(res);
    }
}