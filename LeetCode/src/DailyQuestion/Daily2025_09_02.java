package DailyQuestion;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Daily2025_09_02 {
    public static void main(String[] args) {
        int[][] in = new int[][]{{3,1}, {1,3}, {1,1}};
        int out = numberOfPairs(in);
        System.out.println(out);
    }
    static int[][] point;
    public static int numberOfPairs(int[][] points) {
        point = points;
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a,b) ->{
            if(a[0] == b[0]){
                return b[1] - a[1];
            } else {
                return a[0] - b[0];
            }
        });
        for (int[] ints : points) {
            pq.offer(ints);
        }
        int[][] newPoints = new int[points.length][2];
        for (int i = 0; i < points.length; i++) {
            newPoints[i] = pq.poll();
        }
        int res = 0;
        for (int i = 0; i < points.length; i++) {
            int[] a = newPoints[i];
            for (int j = i + 1; j < points.length; j++) {
                int b[] = newPoints[j];
                if (founction1(a ,b)){
                    if(founction2(a ,b)){
                        res++;
                    }
                }
            }
        }
        return res;
    }
    public static boolean founction1(int[] a, int[] b) {
        if (a[1] >= b[1]) {
            return true;
        }
        return false;
    }
    public static boolean founction2(int[] a, int[] b) {
        for (int[] ints : point) {
            if((ints[0] != a[0] || ints[1] != a[1]) && (ints[0] != b[0] || ints[1] != b[1])){
                if ((ints[0] >= a[0] && ints[0] <= b[0]) && (ints[1] <= a[1] && ints[1] >= b[1])) {
                    return false;
                }
            }
        }
        return true;
    }
}
