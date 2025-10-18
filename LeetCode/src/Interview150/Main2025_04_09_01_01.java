package Interview150;

public class Main2025_04_09_01_01 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur = head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        count -= n;
        if (count == 0) {
            return head.next;
        }
        cur = head;
        while (count > 1) {
            cur = cur.next;
            count--;
        }
        if(n == 1){
            cur.next = null;
            return head;
        }else {
            ListNode pre = cur;
            cur = cur.next.next;
            pre.next = cur;
            return head;
        }
    }
}
