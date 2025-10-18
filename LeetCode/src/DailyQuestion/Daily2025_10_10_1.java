package src.DailyQuestion;

public class Daily2025_10_10_1 {
    public int maximumEnergy(int[] energy, int k) {
        int[] temp = new int[k];
        int res = Integer.MIN_VALUE;
        for (int i = energy.length - 1; i > 0; i--) {
            temp[i%k] += energy[i];
            res = Math.max(res, temp[i%k]);
        }
        return res;
    }
}
