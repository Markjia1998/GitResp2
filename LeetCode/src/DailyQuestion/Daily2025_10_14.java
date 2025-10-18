package src.DailyQuestion;

import java.util.HashSet;
import java.util.List;

public class Daily2025_10_14 {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        if(k == 1) return true;
        HashSet<Integer> set = new HashSet<>();
        int slow = nums.size() - 1, fast = nums.size() - 2;
        while (fast >= 0) {
            if(nums.get(fast) < nums.get(fast + 1)) {
                fast--;
                if(slow - fast >= k){
                    if(set.contains(fast+1-k)) return true;
                    set.add(fast+1);
                }
            }else {
                slow = fast;
                fast--;
            }
        }
        return false;
    }
}
