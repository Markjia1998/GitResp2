package Hot100;

public class Main2025_02_26_02_01 {
    public int minDistance(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        if(m == 0 || n == 0) return Math.max(word1.length(), word2.length());
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++){
            dp[i][0] = i;
        }
        for (int i = 0; i <= n; i++){
            dp[0][i] = i;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (word1.charAt(i) == word2.charAt(j)) {
                    dp[i+1][j+1] = dp[i][j];
                }else {
                    dp[i+1][j+1] = Math.min(dp[i][j], Math.min(dp[i+1][j],dp[i][j+1])) + 1;
                }
            }
        }
        return dp[m][n];
    }
}
