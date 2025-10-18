package Hot100;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Main2025_02_07_01_01 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        for (int num : nums) {
            pq.add(num);
        }
        for (int i = 0; i < k-1; i++) {
            pq.remove();
        }
        return pq.remove();
    }
}
