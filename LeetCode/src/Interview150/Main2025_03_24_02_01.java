package Interview150;

public class Main2025_03_24_02_01 {
    public void setZeroes(int[][] matrix) {
        int rowlen = matrix.length;
        int collen = matrix[0].length;
        boolean[] row = new boolean[rowlen];
        boolean[] col = new boolean[collen];
        for (int i = 0; i < rowlen; i++) {
            for (int j = 0; j < collen; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for (int i = 0; i < rowlen; i++) {
            for (int j = 0; j < collen; j++) {
                if (row[i] || col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
