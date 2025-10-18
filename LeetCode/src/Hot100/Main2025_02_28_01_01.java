package Hot100;

import java.util.HashMap;

public class Main2025_02_28_01_01 {
    public void sortColors(int[] nums) {
        int[] count = new int[3];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }
        for (int i = 0; i < count.length; i++) {
            while (count[0] > 0) {
                count[0]--;
                nums[i++] = 0;
            }
            while (count[1] > 0) {
                count[1]--;
                nums[i++] = 1;
            }
            while (count[2] > 0) {
                count[2]--;
                nums[i++] = 2;
            }
        }
    }
}
