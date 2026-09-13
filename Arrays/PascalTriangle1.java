public class PascalTriangle1 {

    public static void main(String[] args) {

        int n = 4;

        for (int row = 1; row <= n; row++) {

            int ans = 1;

            for (int column = 1; column <= row; column++) {

                System.out.print(ans + " ");

                ans = ans * (row - column) / column;
            }

            System.out.println();
        }
    }
}