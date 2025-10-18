package Interview150;

import java.util.HashSet;

public class Main2025_03_20_02_01 {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() < 2) return s.length();
        int res = Integer.MIN_VALUE;
        int l = 0, r = 0;
        HashSet<Character> set = new HashSet<>();
        while (r < s.length()) {
            if (!set.contains(s.charAt(r))) {
                set.add(s.charAt(r));
                r++;
            } else {
                res = Math.max(res, r - l);
                set.remove(s.charAt(l));
                l++;
            }
        }
        res = Math.max(res, r - l + 1);
        return res < 0 ? 0 : res;
    }
}
