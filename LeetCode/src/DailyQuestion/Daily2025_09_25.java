package src.DailyQuestion;

import java.util.ArrayList;
import java.util.List;

public class Daily2025_09_25 {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle.size() == 1) return triangle.get(0).get(0);
        ArrayList<Integer> reslist = new ArrayList<>();
        reslist.add(triangle.get(0).get(0));
        for (int i = 1; i < triangle.size(); i++) {
            for (int j = triangle.get(i).size() - 1; j >=0; j--) {
                if (j == 0){
                    reslist.set(j, reslist.get(j) + triangle.get(i).get(j));
                } else if (j == triangle.get(i).size() - 1) {
                    reslist.add(reslist.get(j - 1) + triangle.get(i).get(j));
                } else {
                    int min = Math.min(reslist.get(j), reslist.get(j-1));
                    reslist.set(j, min + triangle.get(i).get(j));
                }
            }
        }
        int res = Integer.MAX_VALUE;
        for (Integer i : reslist) {
            if (i < res) res = i;
        }
        return res;
    }
}
