package Interview150;

import java.util.PriorityQueue;

public class Main2025_04_23_01_01 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> a- b);
    public int kthSmallest(TreeNode root, int k) {
        process04_23_01(root);
        for (int i = 0; i < k - 1; i++) {
            pq.poll();
        }
        return pq.poll();
    }

    private void process04_23_01(TreeNode root) {
        if (root == null) return;
        pq.offer(root.val);
        if (root.left != null) process04_23_01(root.left);
        if (root.right != null) process04_23_01(root.right);
    }
}
