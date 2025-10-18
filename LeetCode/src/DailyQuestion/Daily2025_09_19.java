package DailyQuestion;

public class Daily2025_09_19 {
    int[][] intarr;

    public void Spreadsheet(int rows) {
        intarr = new int[rows][26];
    }

    public void setCell(String cell, int value) {
        int x = cell.charAt(0) - 'A';
        int y = Integer.parseInt(cell.substring(1,cell.length()));
        intarr[y][x] = value;
    }

    public void resetCell(String cell) {
        int x = cell.charAt(0) - 'A';
        int y = Integer.parseInt(cell.substring(1,cell.length()));
        intarr[y][x] = 0;
    }

    public int getValue(String formula) {
        int res = 0;
        boolean flag = false;
        for(int i = 1; i < formula.length(); i++) {
            if(Character.isUpperCase(formula.charAt(i))){
                int x = formula.charAt(i) - 'A';
                int count = 0;
                i++;
                while (i < formula.length() && Character.isDigit(formula.charAt(i))) {
                    count++;
                    i++;
                }
                int y = Integer.parseInt(formula.substring(i-count,i));
                if(!flag) {
                    res += intarr[y][x];
                }
            } else if (Character.isDigit(formula.charAt(i))) {
                int count = 0;
                while (i < formula.length() && Character.isDigit(formula.charAt(i))) {
                    count++;
                    i++;
                }
                res += Integer.parseInt(formula.substring(i-count,i));
            }
        }

        return res;
    }
}
