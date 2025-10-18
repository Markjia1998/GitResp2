package Interview150;

public class Main2025_03_11_01_01 {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        res[1] = nums[0];
        int r = nums[nums.length - 1];
        if(nums.length > 2){
            for (int i = 2; i < nums.length; i++) {
                res[i] = nums[i - 1] * res[i - 1];
            }
            for (int i = nums.length - 2; i > 0; i--) {
                res[i] *= r;
                r *= nums[i];
            }
        }
        res[0] = r;
        return res;
    }
}
