class DecimalToBinary {

    public static String reverse(String s) {

        char[] arr = s.toCharArray();

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        return new String(arr);
    }

    public static void main(String[] args) {

        int n = 7;
        int orignal = n;

        String res = "";
        int count = 0;
        while (n >= 1) {
            int rem = n % 2;
            // if (rem == 1)
            count += (n & 1);
            res += rem;
            // n/=2
            n = n >> 1;
        }

        res = reverse(res);

        System.out.printf("Binary of %d is : %s and total set bit are %d ", orignal, res, count);
    }
}