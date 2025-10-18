package Hot100;

import java.util.ArrayList;
import java.util.List;

public class Main2025_02_11_01_01 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                }else {row.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));}
            }
            res.add(row);
        }
        return res;
    }
}
