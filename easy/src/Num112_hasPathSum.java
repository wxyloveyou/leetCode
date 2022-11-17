import java.util.function.BiConsumer;

/**
 * @author : WXY
 * @program : LeetCode
 * @className ：Num112_hasPathSum
 * @create : 2022/11/17:22:41
 * @info :  112. 路径总和
 **/
public class Num112_hasPathSum {
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

    int res = 0;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        sum(root, 0, targetSum);
        return res > 0 ? true : false;
    }

    private void sum(TreeNode root, int sum, int aim) {
        if (root == null) {
            return;
        }
        sum += root.val;
        if (root.right == null && root.left == null) {
            if (sum == aim) {
                res++;
            }
        }
        sum(root.left, sum, aim);
        sum(root.right, sum, aim);
    }
}
