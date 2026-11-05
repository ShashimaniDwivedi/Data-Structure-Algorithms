public class AddWithOutPlus {
    public static void add(int a, int b) {
        while (b != 0) {
            int borrow = (a & b) << 1;
            a = a ^ b;
            b = borrow;
        }
        System.out.println(a);
    }

    public static void subtract(int a, int b) {
        while (b != 0) {
            int borrow = ((~a) & b) << 1;
            a = a ^ b;
            b = borrow;
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        add(a, b);
        subtract(a, b);

    }
}