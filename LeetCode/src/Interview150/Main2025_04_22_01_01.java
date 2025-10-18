package Interview150;

import java.util.*;

public class Main2025_04_22_01_01 {
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

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        if (root == null) return res;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        boolean flag = true;
        while (!queue.isEmpty()) {
            TreeNode node = queue.pollFirst();
            if (node == null){
                if (list.size() == 0){
                    break;
                }
                if(flag == true){
                    res.add(list);
                    list = new ArrayList<>();
                    flag = false;
                    queue.add(null);
                    continue;
                } else {
                    list = reverse(list);
                    res.add(list);
                    list = new ArrayList<>();
                    flag = true;
                    queue.add(null);
                    continue;
                }
            }
            list.add(node.val);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        return res;
    }

    private List<Integer> reverse(List<Integer> list) {
        int len = list.size();
        List<Integer> res = new ArrayList<>();
        for (int i = len - 1; i >= 0; i--) {
            res.add(list.get(i));
        }
        return res;
    }
}
