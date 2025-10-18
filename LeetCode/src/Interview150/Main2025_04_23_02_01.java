package Interview150;

public class Main2025_04_23_02_01 {

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

    public boolean isValidBST(TreeNode root) {
        return process04_23_02(root).isVBST;
    }

    private ReturnTyp_04_23_02 process04_23_02(TreeNode root) {
        if(root.left == null && root.right == null) {
            return new ReturnTyp_04_23_02(true, root.val, root.val);
        } else if (root.left == null) {
            ReturnTyp_04_23_02 right = process04_23_02(root.right);
            return new ReturnTyp_04_23_02(root.val < right.min && right.isVBST, root.val, right.max);
        } else if (root.right == null) {
            ReturnTyp_04_23_02 left = process04_23_02(root.left);
            return new ReturnTyp_04_23_02(root.val > left.max && left.isVBST, left.min, root.val);
        } else {
            ReturnTyp_04_23_02 right = process04_23_02(root.right);
            ReturnTyp_04_23_02 left = process04_23_02(root.left);
            return new ReturnTyp_04_23_02(root.val < right.min && right.isVBST &&root.val > left.max && left.isVBST, left.min, right.max);
        }
    }

    class ReturnTyp_04_23_02{
        boolean isVBST;
        int min;
        int max;

        public ReturnTyp_04_23_02(boolean isVBST, int min, int max) {
            this.isVBST = isVBST;
            this.min = min;
            this.max = max;
        }
    }
}
