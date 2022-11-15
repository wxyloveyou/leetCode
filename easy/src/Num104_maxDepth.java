import javax.swing.*;

/**
 * @program: LeetCode
 * @ClassName Num104_maxDepth
 * @description: LeetCode : 104. 二叉树的最大深度
 * @author: WXY
 * @create: 2022-11-15 17:29
 * @Version 1.0
 **/

public class Num104_maxDepth {
    public static class TreeNode {
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
    public static int maxDepth(TreeNode root) {
       return process(root).height;
    }

    private static Info process(TreeNode root) {
        if (root == null) {
            return new Info(0);
        }

        Info leftInfo = process(root.left);
        Info rightInfo = process(root.right);

        int height = Math.max(leftInfo.height, rightInfo.height);
        return new Info(height);

    }
    public static class Info {
        public int height;
        public Info(int height) {
            this.height = height;
        }
    }

    public static void main(String[] args) {

    }
}
