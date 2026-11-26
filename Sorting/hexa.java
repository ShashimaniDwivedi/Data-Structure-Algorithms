
class hexa {
    public static void main(String[] args) {

        boolean[] arr = {
                true, false, true, false,
                true, false, true, false
        };

        int[] num = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            num[i] = arr[i] ? 1 : 0;
        }

        int i1 = 0;
        int j1 = num.length - 1;
        while (i1 < j1) {
            int temp = num[i1];
            num[i1] = num[j1];
            num[j1] = temp;
            i1++;
            j1--;
        }

        for (int i = 0; i < num.length; i += 4) {

            int decimal = 0;

            for (int j = i; j < i + 4 && j < num.length; j++) {
                decimal = decimal * 2 + num[j];
            }

            System.out.print(decimal);
        }
    }
}
