package src.DailyQuestion;

public class Daily2025_10_02 {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int res = numBottles;
        while (numBottles > numExchange){
            numBottles -= numExchange-1;
            res++;
            numExchange++;
        }
        return res;
    }
}
