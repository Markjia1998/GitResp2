package Interview150;

import java.util.LinkedList;

public class Main2025_03_15_01_01 {
    public String reverseWords(String s) {
        LinkedList<String> stack = new LinkedList<>();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                sb.append(s.charAt(i));
            } else if (s.charAt(i) == ' ' && sb.length() != 0) {
                stack.push(sb.toString());
                sb.setLength(0);
            }
        }
        if (sb.length() != 0) {
            stack.push(sb.toString());
        }
        StringBuffer res = new StringBuffer();
        while (stack.size() > 0) {
            res.append(stack.pop());
            res.append(" ");
        }
        res.deleteCharAt(res.length() - 1);
        return res.toString();
    }
}
