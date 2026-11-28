
import java.util.*;

public class NQueen {

    static boolean isSafe(char[][] board, int row, int col, int n) {

        // Check upper-left diagonal
        int r = row;
        int c = col;

        while (r >= 0 && c >= 0) {
            if (board[r][c] == 'Q')
                return false;

            r--;
            c--;
        }

        // Check lower-left diagonal
        r = row;
        c = col;

        while (r < n && c >= 0) {
            if (board[r][c] == 'Q')
                return false;

            r++;
            c--;
        }

        // Check left side of current row
        for (int j = 0; j < col; j++) {
            if (board[row][j] == 'Q')
                return false;
        }

        return true;
    }

    static void solve(char[][] board, int col, int n) {

        // All columns filled
        if (col == n) {
            printBoard(board, n);
            return;
        }

        // Try every row in current column
        for (int row = 0; row < n; row++) {

            if (isSafe(board, row, col, n)) {

                board[row][col] = 'Q';

                solve(board, col + 1, n);

                // Backtracking
                board[row][col] = '.';
            }
        }
    }

    static void printBoard(char[][] board, int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int n = 4;

        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        solve(board, 0, n);
    }
}
