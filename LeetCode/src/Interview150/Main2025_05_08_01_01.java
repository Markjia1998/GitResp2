package Interview150;

import java.util.LinkedList;
import java.util.Queue;

public class Main2025_05_08_01_01 {
    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        boolean[] visit = new boolean[n * n + 1];
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{1, 0});
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            for (int i = 1; i < 6; i++) {
                int num = cur[0] + i;
                if(num > n * n) break;
                int[] next = process05_08(num, n);
                if(board[next[0]][next[1]] > 0){
                    num = board[next[0]][next[1]];
                }
                if(num == n * n){
                    return cur[1] + 1;
                }
                if(!visit[num]){
                    visit[num] = true;
                    q.offer(new int[]{num, cur[1] + 1});
                }
            }
        }
        return -1;
    }

    int[] process05_08(int num, int n){
        int r = (num - 1) / n, c = (num - 1) % n;
        if (r % 2 == 0){
            c = n - 1 - c;
        }
        return new int[]{n - 1 - r, c};
    }
}
