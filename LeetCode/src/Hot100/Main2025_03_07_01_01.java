package Hot100;

public class Main2025_03_07_01_01 {
    public int maxProfit(int[] prices) {
        int minin = Integer.MAX_VALUE;
        int res = 0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < minin) {
                minin = prices[i];
                for(int j = i+1; j < prices.length; j++) {
                    res = Math.max(res, prices[j] - minin);
                }
            }
        }
        return res;
    }
}
