package Interview150;

public class Main2025_04_08_01_01 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode res = new ListNode(-1);
        res.next = head;
        ListNode pre = null;
        for (int i = 1; i < left; i++) {
            pre = head;
            head = head.next;
        }
        ListNode leftnode = head;
        ListNode leftpre = null;
        for (int i = left; i <= right; i++) {
            leftpre = head;
            head = head.next;
        }
        ListNode rightnode = head;
        pre.next = null;
        leftpre.next = null;
        reverse(leftnode);
        pre.next = leftnode;
        leftpre.next = rightnode;
        return res.next;
    }
    public void reverse(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
    }
}
