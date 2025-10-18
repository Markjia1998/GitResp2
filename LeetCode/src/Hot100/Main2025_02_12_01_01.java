package Hot100;

public class Main2025_02_12_01_01 {
    public int numSquares(int n) {
        int[] partition = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 1; j*j <= i; j++) {
                min = Math.min(min, partition[i - j * j]);
            }
            partition[i] = min + 1;
        }
        return partition[n];
    }
}
