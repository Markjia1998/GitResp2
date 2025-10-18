package Interview150;

import java.util.Arrays;
import java.util.Comparator;

public class Main2025_04_02_01_01 {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] > o2[1]) return 1;
                else if(o1[1] < o2[1]) return -1;
                else return 0;
            }
        });
        int res = 0;
        for (int i = 0; i < points.length; i++) {
            int x = points[i][0],y = points[i][1];
            while (i < points.length - 1 && points[i + 1][0] <= y) {
                i++;
            }
            res++;
        }
        return res;
    }
}
