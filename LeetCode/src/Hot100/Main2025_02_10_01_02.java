package Hot100;

import java.util.*;

public class Main2025_02_10_01_02 {
    public List<Integer> partitionLabels(String s) {
        int[] last = new int[26];
        int len = s.length();
        for (int i = 0; i < len; i++) {
            last[s.charAt(i) - 'a'] = i;
        }
        List<Integer> res = new ArrayList<>();
        int start = 0, end = 0;
        for (int i = 0; i < len; i++) {
            end = Math.max(end, last[s.charAt(i) - 'a']);
            if (i == end) {
                res.add(end - start + 1);
                start = end + 1;
            }
        }
        return res;
    }
}
