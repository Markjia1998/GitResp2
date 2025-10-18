package src.DailyQuestion;

public class Daily2025_10_01 {
    public int numWaterBottles(int numBottles, int numExchange) {
        int res = numBottles, cur = 0;
        while ((numBottles + cur)/numExchange != 0){
            int num = numBottles + cur;
            res += num/numExchange;
            cur = num%numExchange;
            numBottles = num/numExchange;
        }
        return res;
    }
}
