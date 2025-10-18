package Interview150;

public class Main2025_04_14_01_01 {
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
    public boolean isSymmetric(TreeNode root) {
        return getRes25_04_14_01_01(root.left, root.right);
    }

    private boolean getRes25_04_14_01_01(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        if (left.val != right.val) return false;
        return getRes25_04_14_01_01(left.right, right.left) && getRes25_04_14_01_01(left.left, right.right);
    }
}
