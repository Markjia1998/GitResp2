package src.DailyQuestion;

public class Daily2025_10_04 {
    public int maxArea(int[] height) {
        int res = 0, left = 0;
        for (int i = 0; i < height.length - 1; i++) {
            if(height[i] > left) {
                left = height[i];
                for(int j = i+1; j < height.length; j++){
                    res=Math.max(res, Math.min(height[i],height[j])*(j-i));
                }
            }
        }
        return res;
    }
}
