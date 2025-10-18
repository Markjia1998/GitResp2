package Hot100;

public class Main2025_03_04_01_01 {
    public int removeElement(int[] nums, int val) {
        int[] res = new int[51];
        int output = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                res[nums[i]]++;
            } else {
                output++;
            }
        }
        int a = 0;
        for (int i = 0; i < 51; i++) {
            while (res[i] > 0) {
                nums[a++] = i;
                res[i]--;
            }
            if(a + output == nums.length - 1) break;
        }
        return nums.length - output;
    }
}
