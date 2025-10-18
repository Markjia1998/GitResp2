package Interview150;

import java.util.Stack;

public class Main2025_04_02_02_01 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if(top == '(' && c != ')'){
                    return false;
                } else if (top == '{' && c != '}'){
                    return false;
                } else if (top == '[' && c != ']'){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
