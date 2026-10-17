public class TwoSum {
    public static void main(String[] args) {
        int target = 10;
        int[] a = { 1, 3, 5, 7, 2, 6 };
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == target) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }

}
