package Hot100;

public class Main2025_02_27_01_01 {
    public int singleNumber(int[] nums) {
        if(nums.length == 1) return nums[0];
        for(int i = 1; i < nums.length; i++){
            nums[0] ^= nums[i];
        }
        return nums[0];
    }
}
