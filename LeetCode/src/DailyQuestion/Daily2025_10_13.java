package src.DailyQuestion;

import java.util.*;

public class Daily2025_10_13 {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        String last = "";
        for (String word : words) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            StringBuffer sb = new StringBuffer();
            for (char c : charArray) {
                sb.append(c);
            }
            String s = sb.toString();
            if (!set.contains(sb.toString()) || last.equals(s)) {
                set.add(s);
                ans.add(word);
                last = s;
            }
        }
        return ans;
    }
}
