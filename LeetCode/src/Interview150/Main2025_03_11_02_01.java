package Interview150;

public class Main2025_03_11_02_01 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int res = 0, lastsun = Integer.MIN_VALUE, sum = 0;
        for (int i = gas.length - 1; i >= 0; i--) {
            sum += gas[i] - cost[i];
            if (sum > lastsun) {
                res = i;
            }
            lastsun = Math.max(sum, lastsun);
        }
        return sum >= 0 ? res : -1;
    }
}
