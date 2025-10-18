package Hot100;

import java.util.Arrays;

public class Main2025_03_06_01_01 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
