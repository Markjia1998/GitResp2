package Interview150;

import java.util.ArrayList;

public class Main2025_04_01_02_01 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals.length == 0) return new int[][]{newInterval};
        ArrayList<int[]> res = new ArrayList<>();
        if(newInterval[1] < intervals[0][0]){
            res.add(newInterval);
        }
        for (int i = 0; i < intervals.length; i++) {
            int left = intervals[i][0],right = intervals[i][1];
            if(i == 0 && newInterval[0] < left && res.size() == 0){
                left = newInterval[0];
            }
            if(left <= newInterval[0] && right >= newInterval[0]){
                while (i < intervals.length - 1 && intervals[i + 1][0] <= newInterval[1]){
                    i++;
                }
                right = Math.max(newInterval[1], intervals[i][1]);
            }
            res.add(new int[]{left,right});
            if(i == intervals.length - 1 && intervals[i][1] < newInterval[0]){
                res.add(newInterval);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
