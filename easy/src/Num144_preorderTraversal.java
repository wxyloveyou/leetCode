import java.util.ArrayList;
import java.util.List;

/**
 * @program: LeetCode
 * @ClassName Num144_preorderTraversal
 * @description: LeetCode : 144. 二叉树的前序遍历
 * @author: WXY
 * @create: 2022-11-04 17:39
 * @Version 1.0
 **/

public class Num144_preorderTraversal {
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

    public List<Integer> preorderTraversal(TreeNode root) {
        //List<Integer> list = new ArrayList<>();
        if (root == null ) return list;
        return preorder(root,list);
    }

    private static List<Integer> preorder(TreeNode root,List list) {
        if (root == null) {
            return null;
        }
        list.add(root.val);
        preorder(root.left, list);
        preorder(root.right, list);
        return list;
    }
}
