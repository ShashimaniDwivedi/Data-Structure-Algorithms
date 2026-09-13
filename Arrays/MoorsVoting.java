// class MoorsVoting {
//     public static int majorityElement(int[] nums) {
// //frequency>n/2
// //apply directly if majority element is guranted
// // if majority element is not  guranted then second pass verify
//         int candidate = 0;
//         int count = 0;

//         // Find candidate
//         for (int num : nums) {
//             if (count == 0) {
//                 candidate = num;
//             }

//             if (num == candidate) {
//                 count++;
//             } else {
//                 count--;
//             }
//         }

//         return candidate;
//     }

//         System.out.println(majorityElement(nums));
//     }
// }

class MoorsVoting {

    public static int majorityElement(int[] nums) {

        int candidate = 0;
        int count = 0;

        // First pass: find candidate
        for (int num : nums) {

            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Second pass: verify candidate
        count = 0;

        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > nums.length / 2) {
            return candidate;
        }

        return -1; // No majority element
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };

        System.out.println(majorityElement(arr));
    }
}