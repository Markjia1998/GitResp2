package DailyQuestion;

import java.util.*;

public class Daily2025_08_28_01 {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        if (n <= 1) return grid;
        int[][] res = new int[n][n];
        int a = 0;
        for (int i = 0; i < 2 * n - 1; i++) {
            if(i < n - 1){
                a++;
                Integer[] arr = new Integer[a];
                for(int j = 0; j < a; j++){
                    arr[j] = grid[i][n - i + j];
                }
                Arrays.sort(arr);
                for(int j = 0; j < a; j++){
                    res[i][n - i + j] = arr[j];
                }
            } else {
                if(i == n - 1){
                    a++;
                } else {
                    a--;
                }
                Integer[] arr = new Integer[a];
                for(int j = 0; j < a; j++){
                    arr[j] = grid[i][n - i + j];
                }
                Arrays.sort(arr);
                Collections.reverse(Arrays.asList(arr));
                for (Integer num : arr) {
                    res[i][n - i + num] = num;
                }
            }
        }
        return res;
    }
}
