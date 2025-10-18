package Interview150;

import java.util.HashMap;

public class Main2025_04_15_01_01 {
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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int len = inorder.length;
        if (len == 0) return null;
        map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return process25_04_15_01_01(inorder, postorder, 0, len - 1, 0, len - 1);
    }

    private TreeNode process25_04_15_01_01(int[] inorder, int[] postorder, int inleft, int inright, int postleft, int postright) {
        if(inleft > inright || postleft > postright) return null;
        int postroot = postright;
        int inroot = map.get(postorder[postroot]);
        TreeNode root = new TreeNode(postorder[postroot]);
        int lenLeftSub = inroot - inleft;
        root.left = process25_04_15_01_01(inorder, postorder, inleft, inleft + lenLeftSub - 1, postleft, postleft + lenLeftSub - 1);
        root.right = process25_04_15_01_01(inorder, postorder, inroot + 1, inright, postleft + lenLeftSub + 1, postroot - 1);
        return root;
    }
}
