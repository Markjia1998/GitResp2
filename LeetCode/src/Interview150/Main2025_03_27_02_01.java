package Interview150;

import java.util.*;

public class Main2025_03_27_02_01 {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList<List<String>>();
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for(String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if(!map.containsKey(key)) {
                List<String> r = new ArrayList<>();
                r.add(s);
                map.put(key, r);
            } else {
                map.get(key).add(s);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for(String s : map.keySet()) {
            res.add(new ArrayList<>(map.get(s)));
        }
        return res;
    }
}
