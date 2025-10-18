package Interview150;

public class Main2025_03_24_01_01 {
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        for (int i = 0; i < len/2; i++) {
            for (int j = i; j < len/2 - i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[len - j - 1][i];
                matrix[len - j - 1][i] = matrix[len - i - 1][len - j - 1];
                matrix[len - i - 1][len - j - 1] = matrix[j][len - i - 1];
                matrix[j][len - i - 1] = temp;
            }
        }
    }
}
