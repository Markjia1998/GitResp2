package Interview150;

import java.util.HashMap;

public class Main2025_04_07_02_01 {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    HashMap<Node, Node> map = new HashMap<Node, Node>();
    public Node copyRandomList(Node head) {
        if(head == null) return null;
        if(!map.containsKey(head)) {
            Node newHead = new Node(head.val);
            map.put(head, newHead);
            newHead.next = copyRandomList(head.next);
            newHead.random = copyRandomList(head.random);
        }
        return map.get(head);
    }
}
