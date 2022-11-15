/**
 * @program: LeetCode
 * @ClassName Num101_isSymmetric
 * @description: LeetCode : 101. 对称二叉树
 * @author: WXY
 * @create: 2022-11-15 17:20
 * @Version 1.0
 **/

public class Num101_isSymmetric {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }

    private boolean isMirror(TreeNode root1, TreeNode root2) {
        if (root1 != null && root2 == null) return false;
        if (root1 == null && root2 != null) return false;
        if (root1 == null && root2 == null) return true;
        return root1.val == root2.val && isMirror(root1.left, root2.right) && isMirror(root1.right, root2.left);

    }

}
