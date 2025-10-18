package Interview150;

public class Main2025_03_08_02_01 {
    public int jump(int[] nums) {
        int res = 0, maxright = nums.length - 1;
        while (maxright > 0){
            for (int i = 0; i < maxright; i++) {
                if(nums[i] + i > maxright){
                    maxright = i;
                    res++;
                    break;
                }
            }
        }
        return res;
    }
}
