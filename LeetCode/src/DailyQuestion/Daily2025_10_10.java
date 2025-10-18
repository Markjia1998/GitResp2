package src.DailyQuestion;

public class Daily2025_10_10 {
    public int maximumEnergy(int[] energy, int k) {
        int res = energy[energy.length-1];
        int[] temp = new int[k];
        for (int i = 0; i < energy.length; i++) {
            if(i > k && temp[i%k] > 0){
                temp[i%k]+=energy[i];
                continue;
            }
            temp[i%k]+=energy[i];
            int cur = energy[i];
            if (i >= k && energy[i - k] > 0) {}
            for (int j = i + k; j < energy.length; j+=k) {
                cur += energy[j];
            }
            res = Math.max(res, cur);
        }
        return res;
    }
}
