package src.DailyQuestion;

public class Daily2025_09_27 {
    public double largestTriangleArea(int[][] points) {
        double max = Integer.MIN_VALUE;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                for (int k = j + 1; k < points.length; k++) {
                    int[] a = points[i];
                    int[] b = points[j];
                    int[] c = points[k];
                    double mianji = 0.5*Math.abs(a[0]*b[1]+b[0]*c[1]+c[0]*a[1]-a[0]*c[1]-b[0]*a[1]-c[0]*b[1]);
                    max = Math.max(max, mianji);
                }
            }
        }
        return max;
    }
}
