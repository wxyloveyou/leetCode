/**
 * @PROJECT_NAME: leetCode
 * @USER: WXY
 * @DATE: 2022/11/2 13:31
 * Info: 100. 相同的树
 */
public class Num100_isSameTree {
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null ) return true;
        if (p == null && q != null ) return false;
        if (p != null && q == null ) return false;
        if (q.val != p.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
