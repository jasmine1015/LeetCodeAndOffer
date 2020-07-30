/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 /**
 * 利用递归的思想：
 * carry为进位标志
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbers(l1, l2, 0);
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2, int carry) {
        if (l1 == null && l2 == null && carry == 0) return null;
        int p = 0, q = 0;
        if (l1 != null) {
            p = l1.val;
            l1 = l1.next;
        }
        if (l2 != null) {
            q = l2.val;
            l2 = l2.next;
        }
        ListNode head = new ListNode((p + q + carry) % 10);
        head.next = addTwoNumbers(l1, l2, (p + q + carry) / 10);
        return head;
    }
}