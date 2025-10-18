package Interview150;

public class Main2025_03_17_01_01 {
    public int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length()) return -1;
        int res = -1;
        int needleLen = needle.length();
        for (int i = 0; i < haystack.length(); i++) {
            int l = 0;
            while (l < needleLen && i < haystack.length() && haystack.charAt(i) == needle.charAt(l) ) {
                i++;
                l++;
            }
            if (l == needleLen) {
                res = i-needleLen;
                break;
            } else if(l != 0){
                i-=l;
            }
        }
        return res;
    }
}
