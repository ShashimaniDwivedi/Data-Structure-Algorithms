public class SortOneTwos {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 1, 0, 1, 1, 2, 2, 1, 0 };
        int zero = 0, one = 0, two = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zero++;
            }
            if (arr[i] == 1) {
                one++;
            }
            if (arr[i] == 2) {
                two++;
            }
        }
        int[] temp = new int[arr.length];
        for (int i = 0; i < zero; i++) {
            temp[i] = 0;
        }
        for (int i = zero; i < one + zero; i++) {
            temp[i] = 1;
        }
        for (int i = zero + one; i < zero + one + two; i++) {
            temp[i] = 2;
        }
        for (int i : temp) {
            System.out.print(i + " ");
        }

    }

}
