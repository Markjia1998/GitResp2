package Interview150;

public class Main2025_03_14_01_01 {
    public int lengthOfLastWord(String s) {
        boolean flag = false;
        int res = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (Character.isAlphabetic(s.charAt(i)) && !flag) {
                flag = true;
                res++;
            } else if (Character.isAlphabetic(s.charAt(i)) && flag) {
                res++;
            } else if (res != 0 && !Character.isAlphabetic(s.charAt(i))) {
                break;
            }
        }
        return res;
    }
}
