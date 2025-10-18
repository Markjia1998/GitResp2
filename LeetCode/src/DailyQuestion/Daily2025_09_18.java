package DailyQuestion;

import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class Daily2025_09_18 {
    HashMap<Integer, int[]> map;
    PriorityQueue<int[]> pq;

    public void TaskManager(List<List<Integer>> tasks) {
        map = new HashMap<>();
        pq = new PriorityQueue<>((a,b) ->{
            if(a[0] != b[0])return b[0]-a[0];
            return b[1]-a[1];
        });
        for (List<Integer> task : tasks) {
            int userId = task.get(0), taskId = task.get(1), priority = task.get(2);
            map.put(taskId, new int[]{userId, priority});
            pq.add(new int[]{priority, taskId});
        }
    }

    public void add(int userId, int taskId, int priority) {
        map.put(taskId, new int[]{userId, priority});
        pq.add(new int[]{priority, taskId});
    }

    public void edit(int taskId, int newPriority) {
        if(map.containsKey(taskId)) {
            pq.offer(new int[]{newPriority, taskId});
            map.get(taskId)[1] = newPriority;
        }
    }

    public void rmv(int taskId) {
        map.remove(taskId);
    }

    public int execTop() {
        while (!pq.isEmpty()) {
            int[] a = pq.poll();
            int priority = a[0], taskId = a[1];
            if(map.containsKey(taskId) && priority == map.get(taskId)[1]) {
                int userId = map.get(taskId)[0];
                map.remove(taskId);
                return userId;
            }
        }
        return -1;
    }
}
