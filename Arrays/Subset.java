import java.util.*;

public class Subset {
    public static void main(String[] args) {

        int num[] = { 1, 2, 3 };

        List<List<Integer>> result = new ArrayList<>();

        int subset = (int) Math.pow(2, num.length);

        for (int i = 0; i < subset; i++) {

            List<Integer> ans = new ArrayList<>();

            for (int j = 0; j < num.length; j++) {

                if ((i & (1 << j)) != 0) {
                    ans.add(num[j]);
                }
            }

            result.add(ans);
        }

        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }
}