package Interview150;

import java.util.Stack;

public class Main2025_04_03_01_01 {
    public String simplifyPath(String path) {
        Stack<String> stk = new Stack<>();
        for (int i = 0; i < path.length(); i++) {
            StringBuffer sb = new StringBuffer();
            while (i < path.length() && path.charAt(i) == '/') {
                i++;
            }
            if (i < path.length() && path.charAt(i-1) == '/') {
                stk.push("/");
                while (i < path.length() && path.charAt(i) != '.' && path.charAt(i) != '/') {
                    sb.append(path.charAt(i++));
                }
                if(sb.length() == 0){
                    boolean flag = false;
                    while (i < path.length() && path.charAt(i) != '/') {
                        if(path.charAt(i) != '.'){
                            flag = true;
                        }
                        sb.append(path.charAt(i++));
                    }
                    if(sb.length() > 2){
                        stk.add(sb.toString());
                    } else if (!flag && sb.length() == 2) {
                        int a = 3;
                        while(a > 0 && !stk.isEmpty()){
                            stk.pop();
                            a--;
                        }
                    } else if (flag) {
                        stk.push(sb.toString());
                    } else {
                        stk.pop();
                    }
                } else if(i < path.length() && path.charAt(i) != '/'){
                    while (i < path.length() && path.charAt(i) != '/') {
                        sb.append(path.charAt(i++));
                    }
                    stk.add(sb.toString());
                } else {
                    stk.add(sb.toString());
                }
            }
        }
        if (stk.isEmpty()) {
            return "/";
        }
        if (stk.peek().equals("/")) {
            stk.pop();
        }
        Stack<String> temp = new Stack<>();
        while (!stk.isEmpty()) {
            temp.push(stk.pop());
        }
        StringBuffer sb = new StringBuffer();
        while (!temp.isEmpty()) {
            sb.append(temp.pop());
        }
        return sb.toString();
    }
}
