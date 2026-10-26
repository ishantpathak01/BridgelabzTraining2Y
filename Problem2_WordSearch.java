
public class Problem2_WordSearch {
    static int rows = 4, cols = 4;
    static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
    static boolean search(char[][] grid, String word,
                          int i, int j, int index) {
        if (index == word.length()) {
            return true;
        }
        if (i < 0 || j < 0 || i >= rows || j >= cols
                || grid[i][j] != word.charAt(index)) {
            return false;
        }
        char temp = grid[i][j];
        grid[i][j] = '#';
        for (int k = 0; k < 8; k++) {
            if (search(grid, word, i + dx[k],
                       j + dy[k], index + 1)) {
                grid[i][j] = temp;
                return true;
            }
        }
        grid[i][j] = temp;
        return false;
    }
    public static void main(String[] args) {
        char[][] grid = {
            {'C', 'A', 'T', 'S'},
            {'O', 'R', 'E', 'A'},
            {'D', 'E', 'A', 'M'},
            {'E', 'L', 'L', 'S'}
        };
        String word = "DREAM";
        boolean found = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (search(grid, word, i, j, 0)) {
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        System.out.println("Word found: " + found);
    }
}
