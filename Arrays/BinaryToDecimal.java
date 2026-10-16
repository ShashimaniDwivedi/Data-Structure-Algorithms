public class BinaryToDecimal {
    public static void main(String[] args) {
        int a = 101;
        int res = 0;
        int i = 0;

        while (a != 0) {
            int rem = a % 10;
            res = res + (int) (rem * Math.pow(2, i++));
            a /= 10;
        }

        System.out.println(res);
    }
}
