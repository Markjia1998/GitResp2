package src.WeeklyContext;

import java.util.ArrayList;
import java.util.HashMap;

public class WC471_1 {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int res = 0;
        for (Integer i : map.keySet()) {
            if (map.get(i) % k == 0) {
                res += map.get(i)*i;
            }
        }
        return res;
    }
}
