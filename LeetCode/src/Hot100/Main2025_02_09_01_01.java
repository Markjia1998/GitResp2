package Hot100;

public class Main2025_02_09_01_01 {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        if(nums.length < 2) return true;
        int mostRight = 0;
        for (int i = 0; i < n - 1; i++) {
            if(i <= mostRight){
                mostRight = Math.max(mostRight, i + nums[i]);
            }
            if(mostRight >= n - 1){
                return true;
            }
        }
        return false;
    }
}
