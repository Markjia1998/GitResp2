package src.DailyQuestion;

import java.util.HashMap;

public class Daily2025_09_22 {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int res = 0;
        int max = 0;
        for (int num : map.keySet()) {
            if (map.get(num) > max) {
                max = map.get(num);
                res = max;
            } else if (map.get(num) == max) {
                res += map.get(num);
            }
        }
        return res;
    }
}
