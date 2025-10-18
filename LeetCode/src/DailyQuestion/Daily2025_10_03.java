package src.DailyQuestion;

import java.util.PriorityQueue;

public class Daily2025_10_03 {
    public int trapRainWater(int[][] heightMap) {
        int xlen = heightMap[0].length;
        int ylen = heightMap.length;
        if(xlen < 3 || ylen < 3){return 0;}
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b)->a[1]-b[1]);
        boolean[][] visited = new boolean[ylen][xlen];
        for(int i = 0; i < ylen; i++){
            for(int j = 0; j < xlen; j++){
                if(i == 0 || j == 0 || i == ylen - 1 || j == xlen - 1){
                    pq.offer(new int[]{i*ylen + j, heightMap[i][j]});
                    visited[i][j] = true;
                }
            }
        }
        int res = 0;
        while(!pq.isEmpty()){
            int[] top = pq.poll();
            int[] a = new int[]{-1, 0, 1, 0, -1};
            for (int i = 0; i < 4; i++) {
                int x = top[0]%xlen + a[i];
                int y = top[0]/xlen + a[i+1];
                if(x > 0 && y > 0 && !visited[x][y] && x < xlen - 1 && y < ylen - 1){
                    if(heightMap[y][x] < top[1]){
                        res += top[1] - heightMap[y][x];
                        pq.offer(new int[]{y * xlen + x, heightMap[y][x]});
                        visited[y][x] = true;
                    }
                }
            }
        }
        return res;
    }
}
