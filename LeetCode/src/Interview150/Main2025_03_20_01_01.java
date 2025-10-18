package Interview150;

public class Main2025_03_20_01_01 {
    public int minSubArrayLen(int target, int[] nums) {
        int res = Integer.MAX_VALUE;
        int l = 0, r = 0;
        int sum = 0;
        while (r < nums.length) {
            sum += nums[r];
            if (sum == target) {
                res = Math.min(res, r - l + 1);
                r++;
            } else if (sum < target) {
                r++;
            } else {
                if(r == 0) return 1;
                while (sum >= target && r < nums.length) {
                    sum -= nums[l];
                    l++;
                    if (sum >= target) {
                        res = Math.min(res, r - l + 1);

                    }
                }
                r++;
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
