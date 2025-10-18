package src.DailyQuestion;

public class Daily2025_09_29 {
    public int minScoreTriangulation(int[] values) {
        int res = 0;
        for (int i = 1; i < values.length - 1; i++) {
            res += values[0]*values[i]*values[i+1];
        }
        for (int i = 1; i < values.length; i++) {
            int cur = 0;
            for (int j = 0; j < values.length; j++) {
                if(j == i - 1){
                    j++;
                    continue;
                }
                if(j == values.length - 1){
                    cur += values[values.length - 1]*values[j]*values[0];
                    continue;
                }
                cur += values[i]*values[j]*values[j+1];
            }
            res = Math.min(res, cur);
        }
        return res;
    }
}
