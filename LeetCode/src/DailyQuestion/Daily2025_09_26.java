package src.DailyQuestion;

import java.util.Arrays;

public class Daily2025_09_26 {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            int m = i + 2;
            for (int j = i + 1; j < n; j++) {
                int sum = nums[i] + nums[j];
                for (int k = m - 1; k < n; k++) {
                    if (nums[k] >= sum){
                        res += k - j - 1;
                        break;
                    }
                    m++;
                }
            }
        }
        return res;
    }
}
