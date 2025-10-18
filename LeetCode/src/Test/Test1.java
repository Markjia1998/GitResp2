package Test;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b)-> a - b);
        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);
        for (Integer i : pq) {
            System.out.println(i);
        }
        System.out.println("完成");
    }
}
