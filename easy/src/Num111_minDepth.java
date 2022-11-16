import java.nio.channels.NonReadableChannelException;
import java.rmi.NotBoundException;

/**
 * @program: LeetCode
 * @ClassName Num111_minDepth
 * @description: LeetCode :  111. 二叉树的最小深度
 * @author: WXY
 * @create: 2022-11-16 08:55
 * @Version 1.0
 **/

public class Num111_minDepth {
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

    public int minDepth1(TreeNode root) {
        return getMinDepth(root);
    }

    private int getMinDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right != null) {
            return 1 + getMinDepth(root.right);
        }
        if (root.left != null && root.right == null) {
            return 1 + getMinDepth(root.left);
        }
        return 1 + Math.min(getMinDepth(root.left), getMinDepth(root.right));
    }



    public int minDepth2(TreeNode root) {
        return process(root).height;
    }

    private Info process(TreeNode x) {
        if (x == null) {
            return new Info(0);
        }
        if (x.left != null && x.right == null) {
            return new Info(process(x.left).height + 1);
        }
        if (x.left == null && x.right != null) {
            return new Info(process(x.right).height + 1);
        }

        Info leftInfo = process(x.left);
        Info rightInfo =  process(x.right);
        int height = Math.min(leftInfo.height,rightInfo.height) + 1;
        return new Info(height);
    }

    public static class Info {
        public int height;
        public Info(int height) {
            this.height = height;
        }
    }
}
