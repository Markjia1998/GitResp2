package Interview150;

import java.util.HashSet;

public class Main2025_03_21_02_01 {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] != '.') {
                    if(set.contains(board[i][j])) return false;
                    set.add(board[i][j]);
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < board[0].length; j++) {
                if (board[j][i] != '.') {
                    if(set.contains(board[i][j])) return false;
                    set.add(board[i][j]);
                }
            }
        }
        for (int i = 0; i < board.length; i+=3) {
            for (int j = 0; j < board[0].length; j+=3) {
                HashSet<Character> set = new HashSet<>();
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        if(board[i+k][j] != '.') {
                            if(set.contains(board[i][j])) return false;
                            set.add(board[i][j]);
                        }
                    }
                }
            }
        }
        return true;
    }
}
