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
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Info leftInfo =


    }

    public class Info {
        public int height;
        public Info(int height) {
            this.height = height;
        }
    }
}
