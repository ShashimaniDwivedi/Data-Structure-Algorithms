// public class Threesum {
//     public static void main(String[] args) {
//         // i!=j!=k
//         // return unique triplet
//         int[] arr = { -1, 0, 1, 2, -1, -4 };
//         int max = arr.length;
//         for (int i = 0; i < max; i++) {
//             for (int j = i + 1; j < max; j++) {
//                 for (int k = j + 1; k < max; k++) {
//                     if (arr[i] + arr[j] + arr[k] == 0) {
//                         System.out.print(i + " " + j + " " + k + " ");
//                     }
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

import java.util.*;

public class Threesum {

    public static void main(String[] args) {

        int[] arr = { -1, 0, 1, 2, -1, -4 };
        int n = arr.length;

        Set<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < n; i++) {

            Set<Integer> set = new HashSet<>();

            for (int j = i + 1; j < n; j++) {

                int third = -(arr[i] + arr[j]);

                if (set.contains(third)) {

                    List<Integer> triplet = Arrays.asList(
                            arr[i], arr[j], third);

                    Collections.sort(triplet);
                    result.add(triplet);
                }

                set.add(arr[j]);
            }
        }

        System.out.println(result);
    }
}