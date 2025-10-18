package DailyQuestion;

import java.util.HashMap;
import java.util.PriorityQueue;

public class Daily2025_09_17 {
    HashMap<Integer, Integer> ii = new HashMap<>();
    HashMap<Integer, PriorityQueue<Integer>> ip = new HashMap<>();

    public void NumberContainers() {

    }

    public void change(int index, int number) {
        ii.put(index, number);
        ip.computeIfAbsent(number, k -> new PriorityQueue<>()).add(index);
    }

    public int find(int number) {
        PriorityQueue<Integer> pq = ip.get(number);
        if(pq == null){
            return -1;
        }
        while (!pq.isEmpty() && !ii.get(pq.peek()).equals(number)){
            pq.poll();
        }
        return pq.isEmpty() ? -1 : pq.poll();
    }
}
