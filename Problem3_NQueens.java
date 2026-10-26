public class Problem3_NQueens {
    static boolean isSafe(int[][] board, int row, int col, int n) {
        // Check the same column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }
        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1;
             i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        return true;
    }
    static boolean solve(int[][] board, int row, int n) {
        // Base case: All queens have been placed
        if (row == n) {
            return true;
        }
        // Try every column in the current row
        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                board[row][col] = 1;
                if (solve(board, row + 1, n)) {
                    return true;
                }
                // Backtrack
                board[row][col] = 0;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int n = 4;
        int[][] board = new int[n][n];
        if (solve(board, 0, n)) {
            System.out.println("Solution:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (board[i][j] == 1) {
                        System.out.print("Q ");
                    } else {
                        System.out.print(". ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("No solution exists.");
        }
    }
}
