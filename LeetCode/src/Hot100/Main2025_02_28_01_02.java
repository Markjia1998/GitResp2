package Hot100;

public class Main2025_02_28_01_02 {
    public void sortColors(int[] nums) {
        int r = nums.length - 1;
        int l = 0;
        for (int i = 0; i <= r; i++) {
            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[l];
                nums[l] = temp;
                l++;
            } else if (nums[i] == 2) {
                int temp = nums[i];
                nums[i] = nums[r];
                nums[r] = temp;
                r--;
                i--;
            }
        }
    }
}
