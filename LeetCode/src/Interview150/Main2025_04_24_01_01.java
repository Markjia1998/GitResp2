package Interview150;

public class Main2025_04_24_01_01 {
    int[][] map = null;
    public void solve(char[][] board) {
        int row = board.length;
        int col = board[0].length;
        map = new int[row][col];
        for (int i = 0; i < row; i++) {
            process04_24_01(board, i, row, 0, col);
            process04_24_01(board, i, row, col - 1, col);
        }
        for (int i = 0; i < col; i++) {
            process04_24_01(board, 0, row, i, col);
            process04_24_01(board, row - 1, row, i, col);
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (map[i][j] == '1') {
                    board[i][j] = 'O';
                } else {
                    int[][] mapcopy = map;
                    board[i][j] = 'X';
                }
            }
        }

    }

    private void process04_24_01(char[][] board, int i, int row, int j, int col) {
        if(board[i][j] == 'O' && map[i][j] == 0) {
            map[i][j] = 1;
            if(i != 0) process04_24_01(board, i - 1, row, j, col);
            if(i != row - 1) process04_24_01(board, i + 1, row, j, col);
            if(j != col - 1) process04_24_01(board, i, row, j + 1, col);
            if(j != 0) process04_24_01(board, i, row, j - 1, col);
        } else if(board[i][j] == 'x' && map[i][j] == 0){
            map[i][j] = 2;
        }
    }
}
