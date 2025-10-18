package Interview150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2025_03_31_02_01 {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            int temp = nums[i],cur = nums[i];
            while(nums[i+1] == cur +1){
                i++;
                cur++;
            }
            res.add(reStr(temp,cur));
        }
        return res;
    }

    private String reStr(int temp, int cur) {
        if(temp == cur){
            return ""+temp;
        } else {
            return (temp + "->" + cur);
        }
    }
}
