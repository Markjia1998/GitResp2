package DailyQuestion;

import java.util.Arrays;
import java.util.Comparator;

public class Daily2025_09_03 {
    public static void main(String[] args) {
        int[][] points = new int[][]{{0,6},{0,3},{2,4}};
        System.out.println(numberOfPairs(points));
    }
    public static int numberOfPairs(int[][] points) {
        int ans = 0;
        Arrays.sort(points, (a,b)->a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
        for (int i = 0; i < points.length - 1; i++) {
            int[] point1 = points[i];
            int xMax = Integer.MAX_VALUE;
            int xMin = point1[0] - 1;
            int yMax = point1[1] + 1;
            int yMin = Integer.MIN_VALUE;
            for (int j = i + 1; j < points.length; j++) {
                int[] point2 = points[j];
                if(point2[0] < xMax && point2[0] > xMin && point2[1] < yMax && point2[1] > yMin){
                    xMin = point2[0];
                    yMin = point2[1];
                    ans++;
                }
            }
        }
        return ans;
    }
}
