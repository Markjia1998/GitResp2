package src.DailyQuestion;

public class Daily2025_10_09 {
    public long minTime(int[] skill, int[] mana) {
        int n = skill.length, m = mana.length;
        long[] dp = new long[n];
        for (int i = 0; i < m; i++) {
            long cur = 0;
            for (int j = 0; j < n; j++) {
                cur = Math.max(cur, dp[j]) + skill[j] * mana[i];
            }
            dp[n - 1] = cur;
            for (int j = n - 2; j > 0; j--) {
                dp[j - 2] = dp[j-1] - skill[j] * mana[i];
            }
        }
        return dp[n - 1];
    }
}
