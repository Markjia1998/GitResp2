package src.DailyQuestion;

import java.util.*;

public class Daily2025_10_07 {
    public int[] avoidFlood(int[] rains) {
        int[] res = new int[rains.length];
        Arrays.fill(res, -1);
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < rains.length; i++) {
            if (rains[i] == 0) {
                res[i] = 1;
                list.add(i);
            } else {
                if(map.containsKey(rains[i])) {
                    for (int j = 0; j <= list.size(); j++) {
                        if(j == list.size()) {
                            return new int[]{};
                        }
                        if(map.get(rains[i]) < list.get(j)) {
                            res[list.remove(j)] = rains[i];
                            map.put(rains[i], i);
                            break;
                        }
                    }
                }else {
                    map.put(rains[i], i);
                }
            }
        }
        return res;
    }
}
