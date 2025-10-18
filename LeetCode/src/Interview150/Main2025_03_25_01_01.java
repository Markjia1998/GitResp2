package Interview150;
import java.util.*;
public class Main2025_03_25_01_01 {
    public void gameOfLife(int[][] board) {
        List<Integer> lives = new LinkedList<>();
        List<Integer> dead = new LinkedList<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int a = i - 1 < 0 || j - 1 < 0 ? 0 : board[i-1][j-1];
                int b = i - 1 < 0 || j + 1 == board[0].length ? 0 : board[i-1][j+1];
                int c = i - 1 < 0 ? 0 : board[i-1][j];
                int d = j - 1 < 0 || i + 1 == board.length ? 0 : board[i+1][j-1];
                int e = i + 1 == board.length || j + 1 == board[0].length ? 0 : board[i+1][j+1];
                int f = i + 1 == board.length? 0 : board[i+1][j];
                int g = j - 1 < 0 ? 0 : board[i][j-1];
                int h = j + 1 == board[0].length ? 0 : board[i][j+1];
                int count = a+b+c+d+e+f+g+h;
                if((count < 2 && board[i][j] == 1) || (count > 3 && board[i][j] == 1)) {
                    dead.add(i);
                    dead.add(j);
                } else if(count == 3 && board[i][j] == 0) {
                    lives.add(i);
                    lives.add(j);
                }
            }
        }
        while(!dead.isEmpty()) {
            int j = dead.remove(0);
            int i = dead.remove(0);
            board[i][j] = 0;
        }
        while(!lives.isEmpty()) {
            int j = lives.remove(0);
            int i = lives.remove(0);
            board[i][j] = 1;
        }
    }
}
