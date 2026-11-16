import java.util.*;

//N Queen Problem
class NQueen {
    public static List<List<String>> solveNQueen(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        helper(0, board, ans, n);
        return ans;
    }

    public static void helper(int col, char[][] board, List<List<String>> ans, int n) {
        if (col == n) {
            List<String> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                temp.add(new String(board[i]));
            }
            ans.add(temp);
            return;
        }
        for (int row = 0; row < n; row++) {
            if (isSafe(row, col, board, n)) {
                board[row][col] = 'Q';
                helper(col + 1, board, ans, n);
                board[row][col] = '.';
            }
        }
    }

    public static boolean isSafe(int row, int col, char[][] board, int n) {
        // same row left
        for (int j = 0; j < col; j++) {
            if (board[row][j] == 'Q')
                return false;
        }
        // upper left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }
        // lower left
        for (int i = row + 1, j = col - 1; i < n && j >= 0; i++, j--) {
            if (board[i][j] == 'Q')
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(solveNQueen(4));
    }
}