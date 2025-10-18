package Hot100;

import java.util.PriorityQueue;

public class Main2025_02_08_01_01 {
    PriorityQueue<Integer> qMin;
    PriorityQueue<Integer> qMax;
    public void MedianFinder() {
        qMin = new PriorityQueue<>((a, b) -> b - a);
        qMax = new PriorityQueue<>((a, b) -> a - b);
    }

    public void addNum(int num) {
        if(qMin.isEmpty() || num < qMin.peek()){
            qMin.add(num);
            if(qMax.size() + 1 < qMin.size()){
                qMax.add(qMin.poll());
            }
        }else {
            qMax.add(num);
            if(qMin.size() < qMax.size()){
                qMin.add(qMax.poll());
            }
        }
    }

    public double findMedian() {
        if(qMin.size() == qMax.size()){
            return (qMin.peek() + qMax.peek()) / 2.0;
        }else {
            return qMin.peek();
        }
    }
}
