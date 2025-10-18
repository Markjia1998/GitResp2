package Interview150;
import java.text.DecimalFormat;
import java.util.*;

public class Main2025_04_21_01_01 {
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
    List<Double> res = new ArrayList<>();
    public List<Double> averageOfLevels(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        if (root == null) return res;
        stack.add(root);
        stack.add(null);
        DecimalFormat df = new DecimalFormat("0.00000");
        int sum = 0;
        int count = 0;
        while (!stack.isEmpty()) {
            TreeNode node = stack.pollFirst();
            if (node == null) {
                res.add(Double.valueOf(df.format(sum/count)));
                stack.push(null);
                sum = 0;
                count = 0;
                continue;
            }
            if(node.left != null)stack.add(node.left);
            if(node.right != null)stack.add(node.right);
            sum += node.val;
            count++;
        }
        return res;
    }
}
