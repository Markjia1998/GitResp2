package Interview150;

import java.util.HashSet;

public class Main2025_03_31_01_01 {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int max = 0;
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int temp = 1;
                while (set.contains(++num)) {
                    temp++;
                }
                max = Math.max(max, temp);
            }
        }
        return max;
    }

}
