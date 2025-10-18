package src.DailyQuestion;

public class Daily2025_10_16 {
    public int findSmallestInteger(int[] nums, int value) {
        int[] dp = new int[value];
        for (int num : nums) {
            dp[((num % value) + value) % value]++;
        }
        int res = 0;
        while (dp[res % value] > 0) {
            dp[res % value]--;
            res++;
        }
        return res;
    }
}
