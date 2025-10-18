package Interview150;

import java.util.HashMap;

public class Main2025_03_22_01_01 {
    HashMap<Character, Integer> map = new HashMap<>();
    public String minWindow(String s, String t) {
        int slen = s.length(), tlen = t.length(), reslen = slen +1, start = 0, end = 0;
        if(tlen>slen) return "";
        for(int i = 0; i<tlen; i++){
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0)+1);
        }
        int l = 0, r = 0;
        while (l < slen && r < slen){
            //r向右移使符合条件
            while(r < slen && !panduan()){
                char c = s.charAt(r);
                if(map.containsKey(c)){
                    map.put(s.charAt(r), map.get(c)-1);
                }
                r++;
            }
            //l右移
            while(l < s.length() && panduan()){
                char c = s.charAt(l);
                if(map.containsKey(c)){
                    map.put(s.charAt(l), map.get(c)+1);
                }
                l++;
            }
            l--;
            if(r - l< reslen){
                reslen = r - l + 1;
                start = l;
                end = r;
            }
            r++;
            l++;
        }
        return s.substring(start, end);
    }
    //符不符合要求
    public boolean panduan(){
        for (Character c : map.keySet()) {
            if(map.get(c) > 0) return false;
        }
        return true;
    }
}
