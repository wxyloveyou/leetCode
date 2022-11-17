/**
 * @author : WXY
 * @program : LeetCode
 * @className ：Num141_Num141_hasCycle
 * @create : 2022/11/17:22:26
 * @info : 141. 环形链表
 **/
public class Num141_hasCycle {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return false;
        }
        //n1 慢指针，n2快指针
        //快指针一次走两步，慢指针一次走一步， 如果有环，则，
        //在环内，n1 和 n2 必然相遇，因为n2跑的比n1快。第一次相遇后n2来到头部，重新开始走
        //则第二次相交的位置就是入环的位置，返回n1 n2都可以
        ListNode n1 = head.next;
        ListNode n2 = head.next.next;
        while (n1 != n2) {
            if (n2.next == null || n2.next.next == null) {
                return false;
            }
            n2 = n2.next.next;
            n1 = n1.next;
        }
        return true;
    }
}

