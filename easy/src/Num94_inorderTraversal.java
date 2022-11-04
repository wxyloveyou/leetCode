import java.util.ArrayList;
import java.util.List;

/**
 * @PROJECT_NAME: leetCode
 * @USER: WXY
 * @DATE: 2022/11/2 13:20
 * Info: 94. 二叉树的中序遍历
 */
public class Num94_inorderTraversal {
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

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null ) return list;
        return inorder(root,list);
    }

    private static List<Integer> inorder(TreeNode root,List list) {
        if (root == null) {
            return null;
        }
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
        return list;
    }

}
