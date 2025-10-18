package Interview150;

import java.util.HashMap;
import java.util.Stack;

public class Main2025_02_26_02_01 {
    public boolean wordPattern(String pattern, String s) {
        Stack<String> stack = new Stack<>();
        int l = 0, r = 0;
        while (r < s.length()) {
            r++;
            if (s.charAt(r) == ' '){
                stack.push(s.substring(l, r));
                l = r + 1;
            }
        }
        stack.push(s.substring(l, r));
        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();
        if (pattern.length() != stack.size()) return false;
        for (int i = pattern.length() - 1; i >= 0 ; i--) {
            String s1 = stack.pop();
            char c1 = pattern.charAt(i);
            if (!map1.containsKey(c1)) {map1.put(c1, s1);}
            if(!map2.containsKey(s1)) {map2.put(s1, c1);}
            if(c1 != map2.get(s1) || !s1.equals(map1.get(c1))) return false;
        }
        return true;
    }
}
