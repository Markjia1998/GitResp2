package Hot100;

public class Main2025_03_04_02_02 {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int res = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }
}
