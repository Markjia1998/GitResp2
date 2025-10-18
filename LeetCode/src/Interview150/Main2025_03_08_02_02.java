package Interview150;

public class Main2025_03_08_02_02 {
    public int jump(int[] nums) {
        int position = 0;
        int step = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            position = Math.max(position, i + nums[i]);
            if(i == end){
                end = position;
                step++;
            }
            if(end >= nums.length - 1)break;
        }
        return step;
    }
}
