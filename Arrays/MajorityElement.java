// import java.util.*;

// public class MajorityElement {

//     public static void main(String[] args) {

//         int[] arr = { 1, 2, 2, 2, 4, 5, 2, 2, 6 };

//         int n = arr.length / 2;

//         for (int i = 0; i < arr.length; i++) {

//             int counter = 0;

//             for (int j = 0; j < arr.length; j++) {

//                 if (arr[i] == arr[j]) {
//                     counter++;
//                 }
//             }

//             if (counter > n)

//             {
//                 System.out.print(arr[i]);
//                 break;
//             }
//         }

//     }
// }

import java.util.*;

class MajorityElement {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.get(num) > nums.length / 2) {
                return num;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };

        System.out.println(majorityElement(nums));
    }
}

// Moore's Voting Algorithm
