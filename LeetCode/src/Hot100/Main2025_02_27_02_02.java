package Hot100;

import java.util.Arrays;

public class Main2025_02_27_02_02 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
