package src.DailyQuestion;

import java.util.Arrays;
import java.util.HashMap;

public class Daily2025_10_11 {
    public long maximumTotalDamage(int[] power) {
        Arrays.sort(power);
        Long[] dp = new Long[power.length];
        long res = 0;
        dp[0] = (long) power[0];
        int j = 0;
        for (int i = 1; i < power.length; i++) {
            if (power[i] == power[i - 1]) {
                dp[i] = dp[i - 1] + power[i];
            }else {
                for (; power[i] - 2 > power[j] ; j++) {
                    res = Math.max(res, dp[j]);
                }
                dp[i] = res + power[i];
            }
        }
        for (Long l : dp) {
            res = Math.max(res, l);
        }
        return res;
    }
}
