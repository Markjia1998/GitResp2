package Interview150;

public class Main2025_04_17_01_01 {
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
    public int sumNumbers(TreeNode root) {
        returnTyp04_17_01 res = process04_17_01(root);
        return res.qianmian;
    }

    private returnTyp04_17_01 process04_17_01(TreeNode root) {
        if (root.left == null && root.right == null) {
            return new returnTyp04_17_01(10, root.val);
        } else if (root.left == null) {
            returnTyp04_17_01 right = process04_17_01(root.right);
            return new returnTyp04_17_01(right.qianmian * 10, root.val);
        } else if (root.right == null) {
            returnTyp04_17_01 left = process04_17_01(root.left);
            return new returnTyp04_17_01(left.qianmian * 10, root.val);
        }
        returnTyp04_17_01 left = process04_17_01(root.left);
        returnTyp04_17_01 right = process04_17_01(root.right);
        int reqian = left.weishu * root.val + right.weishu * root.val + left.qianmian + right.qianmian;
        int reweishu = left.weishu * 10 + right.weishu * 10;
        return new returnTyp04_17_01(reweishu, reqian);
    }

    class returnTyp04_17_01{
        int weishu;
        int qianmian;

        public returnTyp04_17_01(int weishu, int qianmian) {
            this.weishu = weishu;
            this.qianmian = qianmian;
        }
    }
}
