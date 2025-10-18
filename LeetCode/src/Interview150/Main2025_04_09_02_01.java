package Interview150;

import java.util.HashMap;

public class Main2025_04_09_02_01 {
    HashMap<Integer, Integer> map = new HashMap<>();
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while (cur != null) {
            map.put(cur.val, map.getOrDefault(cur.val, 0) + 1);
            cur = cur.next;
        }
        ListNode res = new ListNode(-1);
        cur = res;
        while (head != null) {
            if (map.get(head.val) == 1) {
                cur.next = new ListNode(head.val);
                cur = cur.next;
                head = head.next;
            } else {
                head = head.next;
            }
        }
        return res.next;
    }
}
