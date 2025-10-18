package Hot100;

import java.util.HashSet;

public class Main2025_03_05_01_01 {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int l = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
                nums[l++] = nums[i];
            }
        }
        return l;
    }
}
