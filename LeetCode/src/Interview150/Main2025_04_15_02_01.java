package Interview150;

import java.util.LinkedList;
import java.util.Queue;

public class Main2025_04_15_02_01 {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }
    public Node connect(Node root) {
        if (root == null) return null;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            Node pre = null;
            for (int i = 0; i < size; i++) {
                Node node = q.poll();
                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
                if (i != 0) {
                    pre.next = node;
                }
                pre = node;
            }
        }
        return root;
    }
}
