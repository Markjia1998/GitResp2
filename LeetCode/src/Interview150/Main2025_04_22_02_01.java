package Interview150;

public class Main2025_04_22_02_01 {
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

    public int getMinimumDifference(TreeNode root) {
        returnTyp_04_22_01 res = process_04_22_01(root);
        return res.minDiff;
    }

    private returnTyp_04_22_01 process_04_22_01(TreeNode root) {
        if(root == null){
            return new returnTyp_04_22_01(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        if(root.left == null && root.right == null){
            return new returnTyp_04_22_01(root.val, root.val, root.val);
        }
        returnTyp_04_22_01 left = process_04_22_01(root.left);
        returnTyp_04_22_01 right = process_04_22_01(root.right);
        int diff = Math.min(Math.abs(root.val - left.maxnum), Math.min(Math.abs(root.val - right.minnum), Math.min(right.minDiff, left.minDiff)));
        int minnum = Math.min(left.minnum, root.val);
        int maxnum = Math.max(right.maxnum, root.val);
        return new returnTyp_04_22_01(diff, minnum, maxnum);
    }

    class returnTyp_04_22_01{
        int minDiff;
        int minnum;
        int maxnum;

        public returnTyp_04_22_01(int minDiff, int minnum, int maxnum) {
            this.minDiff = minDiff;
            this.minnum = minnum;
            this.maxnum = maxnum;
        }
    }
}
