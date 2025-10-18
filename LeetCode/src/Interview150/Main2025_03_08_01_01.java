package Interview150;

public class Main2025_03_08_01_01 {
    public boolean canJump(int[] nums) {
        int maxright = nums[0];
        for (int i = 0; i <= maxright && i < nums.length; i++) {
            maxright = Math.max(maxright, i + nums[i]);
        }
        if(maxright >= nums.length - 1){
            return true;
        } else {
            return false;
        }
    }
}
