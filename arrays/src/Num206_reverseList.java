/**
 * @author : WXY
 * @program : LeetCode
 * @className ：Num206_
 * @create : 2022/11/18:21:44
 * @info :  206. 反转链表
 **/
public class Num206_reverseList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
