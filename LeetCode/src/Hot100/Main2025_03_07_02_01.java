package Hot100;

public class Main2025_03_07_02_01 {
    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE, res = 0;
        for (int i = 0; i < prices.length; i++) {
            if(minprice > prices[i]){
                minprice = prices[i];
            } else {
                res += prices[i] - minprice;
                minprice = prices[i];
            }
        }
        return res;
    }
}
