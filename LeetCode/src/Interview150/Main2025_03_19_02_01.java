package Interview150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2025_03_19_02_01 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int l = i + 1, r = nums.length - 1;
            int target = -nums[i];
            while (l < r) {
                while (l != i + 1 && nums[l] == nums[l - 1]) l++;
                while (nums[r] == nums[r + 1]) r--;
                if (nums[l] + nums[r] == target) {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;

                } else if (nums[l] + nums[r] < target) {
                    l++;
                    while (nums[l] == nums[l - 1]) l++;
                } else {
                    r--;
                    while (nums[r] == nums[r + 1]) r--;
                }
            }
        }
        return res;
    }
}
