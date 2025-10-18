package Interview150;

import java.util.HashMap;

public class Main2025_04_14_02_01 {
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
    HashMap<Integer, Integer> map = null;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int len = preorder.length;
        map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            map.put(inorder[i], i);
        }
        return process2025_04_14_02_01(preorder, inorder, 0, len - 1, 0, len - 1);
    }

    private TreeNode process2025_04_14_02_01(int[] preorder, int[] inorder, int preleft, int preright, int inleft, int inright) {
        if(preleft > inleft || inleft > inright) return null;
        int preroot = preleft;
        int inroot = map.get(preorder[preroot]);
        TreeNode root = new TreeNode(preorder[preroot]);
        int lenLeftSub = inroot - inleft;
        root.left = process2025_04_14_02_01(preorder, inorder, preleft + 1, preleft + lenLeftSub, inleft, inroot - 1);
        root.right = process2025_04_14_02_01(preorder, inorder, preleft + lenLeftSub + 1, preright, inroot + 1, inright);
        return root;
    }

}
