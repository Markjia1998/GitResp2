package Interview150;

import java.util.*;

public class Main2025_04_25_02_01 {
    public String addBinary(String a, String b) {
        int ca = 0;
        int sum = 0;
        StringBuffer sb = new StringBuffer();
        for (int i = a.length(), j = b.length(); i >= 0 || j >= 0; i--, j--) {
            sum = ca;
            sum += i >= 0 ? a.charAt(i) - '0' : 0;
            sum += j >= 0 ? b.charAt(j) - '0' : 0;
            sb.append(sum % 2);
            ca = sum / 2;
        }
        if (ca == 0) return sb.reverse().toString();
        sb.append('1');
        return sb.reverse().toString();
    }
}
