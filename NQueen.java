import java.util.ArrayList;
import java.util.List;

public class NQueen {
    public boolean isSafe(int row, int col, char[][] board) {
        // Horizontal check
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }

        // Vertical check
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Upper left diagonal check
        int r = row;
        for (int c = col; r >= 0 && c >= 0; r--, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // Upper right diagonal check
        r = row;
        for (int c = col; r >= 0 && c < board.length; r--, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // Lower left diagonal check
        r = row;
        for (int c = col; r < board.length && c >= 0; r++, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // Lower right diagonal check
        r = row;
        for (int c = col; r < board.length && c < board.length; r++, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public void saveBoard(char[][] board, List<List<String>> allBoards) {
        List<String> newBoard = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'Q') {
                    row.append('Q');
                } else {
                    row.append(" . ");
                }
            }
            newBoard.add(row.toString());
        }
        allBoards.add(newBoard);
    }

    public void helper(char[][] board, List<List<String>> allBoards, int col) {
        if (col == board.length) {
            saveBoard(board, allBoards);
            return;
        }

        for (int i = 0; i < board.length; i++) {
            if (isSafe(i, col, board)) {
                board[i][col] = 'Q';
                helper(board, allBoards, col + 1);
                board[i][col] = '.';
            }
        }
    }

    public List<List<String>> solveNq(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];

        // Initialize the board with empty slots
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        helper(board, allBoards, 0);
        return allBoards;
    }

    public static void main(String[] args) {
        NQueen nq = new NQueen();
        int n = 5;
        List<List<String>> solutions = nq.solveNq(n);

        // Print solutions
        for (List<String> board : solutions) {

            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
