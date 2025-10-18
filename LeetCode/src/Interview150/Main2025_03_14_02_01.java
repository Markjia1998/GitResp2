package Interview150;

public class Main2025_03_14_02_01 {
    public String longestCommonPrefix(String[] strs) {
        StringBuffer sb = new StringBuffer();
        int len = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            len = Math.min(len, strs[i].length());
        }
        for (int i = 0; i < len; i++) {
            char c = strs[i].charAt(i);
            boolean flag = false;
            for (int j = 0; j < strs.length; j++) {
                if (c != strs[j].charAt(i)) {
                    break;
                }
                if (j == strs.length - 1) {
                    flag = true;
                }
            }
            if (flag) {
                sb.append(c);
            } else {
                return sb.toString();
            }
        }
        return sb.toString();
    }
}
