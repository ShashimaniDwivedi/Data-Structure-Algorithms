import java.util.*;

//TC =O(2^n)
//SC =O(n * 2^n)Auxilarry
public class Subset {

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

        subset(nums, res, tmp, idx + 1);
    }

    public static void main(String[] args) {

        int[] nums = { 1, 2, 3 };

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> tmp = new ArrayList<>();

        subset(nums, res, tmp, 0);

        System.out.println(res);
    }
}