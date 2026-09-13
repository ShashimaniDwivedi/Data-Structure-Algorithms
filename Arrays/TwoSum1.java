// public class TwoSum1 {
//     //Better Solution hashing 
//     public static void main(String[] args) {
//         int target = 5;
//         int[] a = { 1, 2, 3, 5, 4 };
//         for (int i = 0; i < a.length; i++) {
//             for (int j = i+1; j < a.length; j++) {

//                 if (a[i] + a[j] == target) {
//                     System.out.println(i + " " + j);
//                 }
//             }
//         }
//     }

// }

import java.util.HashMap;

public class TwoSum1 {

    public static void main(String[] args) {

        int target = 5;
        int[] a = { 1, 2, 3, 5, 4 };

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {

            int complement = target - a[i];

            if (map.containsKey(complement)) {
                System.out.println(map.get(complement) + " " + i);
            }

            map.put(a[i], i);
        }
    }
}
