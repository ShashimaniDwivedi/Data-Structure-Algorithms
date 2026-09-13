public class TwoSum {
    public static void main(String[] args) {
        int target = 5;
        int[] a = { 1, 2, 3, 5, 4 };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a [ i ]+ a[j]==target){
                    System.out.println(i + " " + j);
                }
            }
        }
    }

}
