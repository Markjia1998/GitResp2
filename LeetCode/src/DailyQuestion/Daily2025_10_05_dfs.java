package src.DailyQuestion;

import java.util.ArrayList;
import java.util.List;

public class Daily2025_10_05_dfs {
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
            dfs(pacific, 0, x);
        }
        for (int y = 0; y < ylen; y++) {
            dfs(pacific, y, 0);
        }
        for(int x = 0; x < xlen; x++){
            dfs(atlantic, ylen - 1, x);
        }
        for (int y = 0; y < ylen; y++) {
            dfs(atlantic, y, xlen - 1);
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
    public static void dfs(boolean[][] panduan, int y, int x) {
        if(panduan[y][x]){
            return;
        }
        panduan[y][x] = true;
        for (int[] ints : a) {
            int newx = x + ints[0];
            int newy = y + ints[1];
            if(newx >= 0 && newy >= 0 && newx < xlen && newy < ylen && heights[newy][newx] >= heights[y][x]){
                dfs(panduan, newy, newx);
            }
        }
    }
}
