package Interview150;

public class Main2025_03_27_01_01 {
    public boolean isAnagram(String s, String t) {
        int len = s.length();
        if(len != t.length()) return false;
        int[] count = new int[26];
        for(char c : s.toCharArray()) count[c - 'a']++;
        for(char c : t.toCharArray()) count[c - 'a']--;
        for(int i : count) if(i != 0) return false;
        return true;
    }
}
