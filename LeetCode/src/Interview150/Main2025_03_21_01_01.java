package Interview150;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main2025_03_21_01_01 {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        int lens = s.length(), nums = words.length, lennum = words[0].length();
        for (int i = 0; i < lennum; i++) {
            if(i + lennum * nums > lens ) {
                break;
            }
            HashMap<String, Integer> map = new HashMap<>();
            for (int j = 0; j < nums; j++) {
                String word = s.substring(j * lennum + i, (j+1) * lennum + i);
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
            for (String word : words) {
                map.put(word, map.getOrDefault(word, 0) - 1);
                if (map.get(word) == 0) map.remove(word);
            }
            for (int start = i; start < lens - lennum * nums + 1; start+=lennum) {
                if (start != i){
                   String word = s.substring(start + (nums - 1) * lennum, start + lennum * nums);
                   map.put(word, map.getOrDefault(word, 0) + 1);
                   if (map.get(word) == 0) map.remove(word);
                   word = s.substring(start - lennum, start);
                   map.put(word, map.getOrDefault(word, 0) - 1);
                   if (map.get(word) == 0) map.remove(word);
                }
                if (map.isEmpty()) res.add(start);
            }
        }
        return res;
    }
}
