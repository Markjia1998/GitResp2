package Interview150;

public class Main2025_03_15_02_01 {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        int row = numRows;
        int colum = s.length()/(numRows*2 - 2) * (numRows - 1);
        char[][] ch = new char[row][colum+colum-2];
        int r = 0, c = 0;
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            ch[r][c] = s.charAt(i);
            if(r < row - 1 && !flag){
                r++;
            } else if(r == row - 1 && !flag){
                flag = true;
                r--;
                c++;
            } else if(r > 0 && flag){
                r--;
                c++;
            } else if (r == 0 && flag) {
                flag = false;
                r++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char[] chars : ch) {
            for (char aChar : chars) {
                if(aChar == ' ') sb.append(aChar);
            }
        }
        return sb.toString();
    }
}
