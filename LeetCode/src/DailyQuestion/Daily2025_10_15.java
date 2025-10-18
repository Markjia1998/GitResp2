package src.DailyQuestion;

import java.util.HashMap;
import java.util.List;

public class Daily2025_10_15 {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int slow = nums.size() - 1, fast = nums.size() - 2;
        while (fast >= 0) {
            if(nums.get(fast) < nums.get(fast + 1)) {
                fast--;
            }else {
                map.put(fast + 1,slow - fast);
                slow = fast;
                fast--;
            }
        }
        if (fast == -1 && nums.get(0) < nums.get(1)){
            map.put(0,slow + 1);
        }
        int res = 1;
        for (Integer i : map.keySet()) {
            if (map.containsKey(i+map.get(i))){
                res = Math.max(res, Math.max(map.get(i)/2, Math.min(map.get(i),map.get(i+map.get(i)))));
            } else {
                res = Math.max(res, map.get(i)/2);
            }
        }
        return res;
    }
}
