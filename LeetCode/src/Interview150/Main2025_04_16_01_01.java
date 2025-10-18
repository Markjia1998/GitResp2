package Interview150;

import java.util.LinkedList;
import java.util.List;

public class Main2025_04_16_01_01 {
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

    public void flatten(TreeNode root) {
        List<TreeNode> l = new LinkedList<>();
        process2025_04_16_01_01(root, l);
        int len = l.size();
        for (int i = 1; i < len; i++) {
            TreeNode pre = l.get(i - 1), cur = l.get(i);
            pre.left = null;
            pre.right = cur;
        }
    }

    private void process2025_04_16_01_01(TreeNode root, List<TreeNode> l) {
        if (root != null) {
            l.add(root);
            process2025_04_16_01_01(root.left, l);
            process2025_04_16_01_01(root.right, l);
        }
    }
}
