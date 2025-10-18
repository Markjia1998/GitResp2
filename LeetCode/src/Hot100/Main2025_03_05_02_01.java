package Hot100;

public class Main2025_03_05_02_01 {
    public int removeDuplicates(int[] nums) {
        if(nums.length < 3) return nums.length;
        int slow = 0, fast = 0, count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[slow]) {
                nums[++slow] = nums[i];
                count = 1;
            } else if (nums[i] == nums[slow] && count < 2) {
                nums[++slow] = nums[i];
                count++;
            }
        }
        return slow;
    }
}
