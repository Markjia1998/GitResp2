package DailyQuestion;

import java.util.PriorityQueue;

public class Daily2025_09_01 {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
            long i = (long)((a[0]+1)/(a[1]+1)-(a[0]/a[1]));
            long j = (long)((b[0]+1)/(b[1]+1)-(b[0]/b[1]));
            if(i == j) return 0;
            return i < j ? 1 : -1;
        });
        for (int[] aClass : classes) {
            pq.offer(aClass);
        }
        for (int i = 0; i < extraStudents; i++) {
            int[] p = pq.poll();
            int pass = p[0], total = p[1];
            pq.offer(new int[]{pass + 1, total + 1});
        }
        double res = 0;
        for (int i = 0; i < classes.length; i++) {
            int[] p = pq.poll();
            int pass = p[0], total = p[1];
            res += 1.0 * pass/total;
        }
        return res/classes.length;
    }
}
