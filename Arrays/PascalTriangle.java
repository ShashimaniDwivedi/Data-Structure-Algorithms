public class PascalTriangle {

    static long factorial(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    static long nCr(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static void main(String[] args) {

        int row = 4;

        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= i; j++) {

                long element = nCr(i - 1, j - 1);

                System.out.print(element + " ");
            }

            System.out.println();
        }
    }
}