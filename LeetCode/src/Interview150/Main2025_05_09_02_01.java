package Interview150;

import java.util.*;

public class Main2025_05_09_02_01 {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int len = beginWord.length();
        Set<String> set = new HashSet<>();
        Set<String> visited = new HashSet<>();
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        for (String string : wordList) {
            set.add(string);
        }
        Queue<String> queue = new LinkedList<>();
        if (beginWord.equals(endWord)) return 0;
        if (!set.contains(endWord)) return 0;
        queue.offer(beginWord);
        visited.add(beginWord);
        int step = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String word = queue.poll();
                for (int j = 0; j < word.length(); j++) {
                    for (int k = 0; k < chars.length; k++) {
                        if (word.charAt(j) == chars[k]) {
                            StringBuffer sb = new StringBuffer(word);
                            sb.setCharAt(j, chars[k]);
                            String s = sb.toString();
                            if(!visited.contains(s) && set.contains(s)){
                                if (s.equals(endWord)) return step;
                                queue.offer(s);
                                visited.add(s);
                            }
                        }
                    }
                }
            }
            step++;
        }
        return 0;
    }
}
