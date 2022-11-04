/**
 * @PROJECT_NAME: leetCode
 * @USER: WXY
 * @DATE: 2022/11/2 11:31
 * Info: 108. 将有序数组转换为二叉搜索树
 *
 * 将中序遍历改成二叉搜索数，
 * 因要求平衡，所以用中间的点做根节点
 *
 */
public class Num108_sortedArrayToBST {
    public static class TreeNode {
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

    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null) return null;
        return buildTree(nums, 0, nums.length - 1);
    }

    private static TreeNode buildTree(int[] nums, int L, int R) {
        if (L > R) {
            return null;
        }
        int mid = L + (R - L) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = buildTree(nums, L, mid - 1);
        node.right = buildTree(nums, mid + 1, R);
        return node;
    }
}
