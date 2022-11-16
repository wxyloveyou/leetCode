/**
 * @program: LeetCode
 * @ClassName Num110_isBalanced
 * @description: LeetCode : 110. 平衡二叉树
 * @author: WXY
 * @create: 2022-11-16 08:41
 * @Version 1.0
 **/

public class Num110_isBalanced {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val,TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isBalanced(TreeNode root) {
        return process(root).isBalanced;
    }

    public static class Info {
        public int height;
        public boolean isBalanced;

        public Info(int height, boolean isBalanced) {
            this.height = height;
            this.isBalanced = isBalanced;
        }
    }

    private Info process(TreeNode root) {
        if (root == null )  {
            return new Info(0, true);
        }
        Info leftInfo = process(root.left);
        Info rightInfo = process(root.right);

        int height = Math.max(leftInfo.height , rightInfo.height) + 1;
        boolean isBalanced = leftInfo.isBalanced && rightInfo.isBalanced &&
                (Math.abs(leftInfo.height - rightInfo.height) <= 1);
        return new Info(height, isBalanced);
    }
}
