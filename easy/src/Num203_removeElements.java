import java.util.HashSet;

/**
 * @author : WXY
 * @program : LeetCode : 203. 移除链表元素
 * @className ：Num203_removeElements
 * @create : 2022/11/18:21:05
 * @info : 203. 移除链表元素
 **/
public class Num203_removeElements {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode h = head;
        //来到第一个不是val 的地方
        while (head != null) {
            if (head.val != val) {
                break;
            }
            head = head.next;
        }
        ListNode pre = head;
        ListNode cur = head;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }
            cur = cur.next;
        }
        return head;
    }
}
