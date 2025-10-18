package Interview150;

public class Main2025_04_10_02_01 {
    public ListNode partition(ListNode head, int x) {
        ListNode lefthead = new ListNode(-1);
        ListNode righthead = new ListNode(-1);
        ListNode leftcurr = lefthead;
        ListNode rightcurr = righthead;
        while (head != null) {
            if (head.val < x) {
                leftcurr.next = new ListNode(head.val);
                leftcurr = leftcurr.next;
                head = head.next;
            } else {
                rightcurr.next = new ListNode(head.val);
                rightcurr = rightcurr.next;
                head = head.next;
            }
        }
        if (righthead.next != null) {
            leftcurr.next = righthead.next;
        }
        return lefthead.next;
    }
}
