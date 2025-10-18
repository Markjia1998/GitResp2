package src.DailyQuestion;

import java.util.Arrays;

public class Daily2025_10_18 {
    public int maxDistinctElements(int[] nums, int k) {
        int res = 0, premin =Integer.MIN_VALUE;
        Arrays.sort(nums);
        for (int num : nums) {
            int cur = Math.min(Math.max(num - k, premin + 1),num + k);
            if(cur > premin){
                res += 1;
                premin = cur;
            }
        }
        return res;
    }
}
