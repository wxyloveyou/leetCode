import java.util.ArrayList;
import java.util.List;

/**
 * @program: LeetCode
 * @ClassName Num_postorderTraversal
 * @description: LeetCode : 145. 二叉树的后序遍历
 * @author: WXY
 * @create: 2022-11-04 17:37
 * @Version 1.0
 **/

public class Num_postorderTraversal {
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

    List<Integer> list = new ArrayList<Integer>();

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) return list;
        return postorder(root, list);
    }

    private static List<Integer> postorder(TreeNode root, List list) {
        if (root == null) {
            return null;
        }
        postorder(root.left, list);
        postorder(root.right, list);
        list.add(root.val);
        return list;
    }

}
