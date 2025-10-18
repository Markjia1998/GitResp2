package Hot100;

public class Main2025_03_06_02_01 {
    public void rotate(int[] nums, int k) {
        if(nums.length < 2) return;
        k %= nums.length;
        int[] temp = new int[k];
        int templeft = 0;
        for (int i = nums.length - k; i < nums.length; i++) {
            temp[templeft++] = nums[i];
        }
        for (int i = nums.length - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }
        templeft = 0;
        for (int i = 0; i < k; i++) {
            nums[templeft++] = temp[i];
        }
    }
}
