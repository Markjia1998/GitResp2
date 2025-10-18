package src.DailyQuestion;

import java.util.ArrayDeque;
import java.util.concurrent.DelayQueue;

public class Daily2025_10_06 {

    static int[][] dirs = new int[][] {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    static boolean[][] panduan;
    public int swimInWater(int[][] grid) {
        int res = grid[0][0];
        panduan = new boolean[grid.length][grid[0].length];
        while (!bfs(grid,0,0,res)){
            res++;
            panduan = new boolean[grid.length][grid[0].length];
        }
        return res;
    }
    public static boolean bfs(int[][] grid, int x, int y, int res) {
        panduan[y][x] = true;
        ArrayDeque<int[]> stack = new ArrayDeque<>();
        stack.offer(new int[]{y, x});
        while(!stack.isEmpty() && !panduan[grid.length-1][grid[0].length-1]){
            int[] cur = stack.pop();
            for (int i = 0; i < 4; i++) {
                int newx = cur[1] + dirs[i][1];
                int newy = cur[0] + dirs[i][0];
                if (newx >= 0 && newy >= 0 && newx < grid[0].length && newy < grid.length && grid[newy][newx] <= res && !panduan[newy][newx]){
                    bfs(grid, newx, newy, res);
                }
            }
        }
        return panduan[grid.length-1][grid[0].length - 1];
    }
}
