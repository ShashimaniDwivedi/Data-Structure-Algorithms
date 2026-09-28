public class BinaryToDecimal {

    public static void main(String[] args) {
        String num = "111";
        int ans = 0;
        for (int i = num.length() - 1; i >= 0; i--) {
            ans = ans + (int) ((num.charAt(i) - '0') * Math.pow(2, i));
        }
        System.out.println(ans);
    }

}
