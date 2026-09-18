import java.util.*;

public class FourSum {
    public static void main(String[] args) {

        int[] arr = { 1, 2, -1, -2, 2, 0, -1 };
        int target = 0;

        Set<List<Integer>> res = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                Set<Integer> set = new HashSet<>();

                for (int k = j + 1; k < arr.length; k++) {

                    int complement = target - arr[i] - arr[j] - arr[k];

                    if (set.contains(complement)) {

                        List<Integer> temp = Arrays.asList(
                                arr[i],
                                arr[j],
                                arr[k],
                                complement);

                        Collections.sort(temp);
                        res.add(temp);
                    }

                    set.add(arr[k]);
                }
            }
        }

        System.out.println(res);
    }
}