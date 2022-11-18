/**
 * @author : WXY
 * @program : LeetCode
 * @className ：Num237_
 * @create : 2022/11/18:21:22
 * @info : 237. 删除链表中的节点
 **/
public class Num237_deleteNode {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
