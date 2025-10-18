package Interview150;

import java.util.ArrayList;
import java.util.List;

public class Main2025_03_28_01_01 {
    public List<String> fullJustify(String[] words, int maxWidth) {
        int len = words.length, right = 0;
        List<String> res = new ArrayList<>();
        while(true){
            int left = right, sublen = 0;
            while(right < len && sublen + words[right].length() + right - left <= maxWidth){
                sublen += words[right++].length();
            }
            if(right == len){
                StringBuffer sb = zuhe(words, left, len, " ");
                int bla = maxWidth - sb.length();
                sb.append(blank(bla));
                res.add(sb.toString());
                return res;
            }
            int subcount = right - left;
            int chae = maxWidth - sublen;
            if(subcount == 1){
                res.add(words[left]+blank(chae));
                continue;
            }
            int avgblank = chae / (subcount-1);
            int yushu = chae % (subcount-1);
            StringBuffer sb = new StringBuffer();
            sb.append(zuhe(words, left, left +yushu + 1,blank(avgblank+1)));
            sb.append(blank(avgblank));
            sb.append(zuhe(words, left + yushu + 1, right,blank(avgblank)));
            res.add(sb.toString());
        }
    }

    private String blank(int bla) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bla; i++) {
            sb.append(" ");
        }
        return sb.toString();
    }

    private StringBuffer zuhe(String[] words, int left, int right, String space) {
        StringBuffer sb = new StringBuffer(words[left]);
        for(int i = left+1; i < right; i++){
            sb.append(space);
            sb.append(words[i]);
        }
        return sb;
    }
}
