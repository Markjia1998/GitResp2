package src.DailyQuestion;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

import static src.DailyQuestion.Daily2025_10_05_dfs.dfs;

public class Daily2025_10_05_bfs {
    static int[][] heights;
    static int xlen;
    static int ylen;
    static int[][] a = new int[][] {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> res = new ArrayList<>();
        this.heights = heights;
        xlen = heights[0].length;
        ylen = heights.length;
        boolean[][] pacific = new boolean[ylen][xlen];
        boolean[][] atlantic = new boolean[ylen][xlen];
        for(int x = 0; x < xlen; x++){
            bfs(pacific, 0, x);
        }
        for (int y = 0; y < ylen; y++) {
            bfs(pacific, y, 0);
        }
        for(int x = 0; x < xlen; x++){
            bfs(atlantic, ylen - 1, x);
        }
        for (int y = 0; y < ylen; y++) {
            bfs(atlantic, y, xlen - 1);
        }
        for(int x = 0; x < xlen; x++){
            for(int y = 0; y < ylen; y++){
                if(pacific[y][x] && atlantic[y][x]){
                    ArrayList<Integer> integers = new ArrayList<>();
                    integers.add(y);
                    integers.add(x);
                    res.add(integers);
                }
            }
        }
        return res;
    }
    public static void bfs(boolean[][] panduan, int y, int x) {
        if(panduan[y][x]){
            return;
        }
        panduan[y][x] = true;
        ArrayDeque<int[]> stack = new ArrayDeque<>();
        stack.offer(new int[]{y,x});
        while(!stack.isEmpty()){
            int[] curr = stack.poll();
            for (int[] ints : a) {
                int newy = curr[0] + ints[0];
                int newx = curr[1] + ints[1];
                if(newx >= 0 && newy >= 0 && newx < xlen && newy < ylen && heights[newy][newx] >= heights[curr[0]][curr[1]] && !panduan[newy][newx]){
                    panduan[newy][newx] = true;
                    stack.offer(new int[]{newy,newx});
                }
            }
        }
    }
}
