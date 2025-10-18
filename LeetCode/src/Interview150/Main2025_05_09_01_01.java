package Interview150;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Main2025_05_09_01_01 {
    public int minMutation(String startGene, String endGene, String[] bank) {
        Set<String> set  = new HashSet<>();
        Set<String> visited = new HashSet<>();
        char[] key = {'A', 'C', 'G', 'T'};
        Queue<String> queue = new LinkedList<>();
        for (String string : bank) {
            set.add(string);
        }
        if(!set.contains(endGene)) return -1;
        queue.add(startGene);
        visited.add(startGene);
        int step = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String cur = queue.poll();
                for (int j = 0; j < 8; j++) {
                    for (int k = 0; k < 4; k++) {
                        if (key[k] != cur.charAt(j)){
                            StringBuffer sb = new StringBuffer(cur);
                            sb.setCharAt(j, key[k]);
                            String s = sb.toString();
                            if (!visited.contains(s) && set.contains(s)) {
                                if(s.equals(endGene)) return step;
                                visited.add(s);
                                queue.add(s);
                            }
                        }
                    }
                }
            }
            step++;
        }
        return -1;
    }
}
