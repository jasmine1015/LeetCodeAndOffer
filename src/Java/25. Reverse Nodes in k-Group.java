/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode new_list = new ListNode(0);
        new_list.next = head;
        ListNode cur = new_list;
        while(cur != null){
            ListNode first = cur.next;
            ListNode end = cur;
            // end指针为下一轮需要交换的最后一个结点
            for (int i = 0; i < k && end != null; i++){
                end = end.next;
            }
            if (end == null) break;
            ListNode p1 = first;
            ListNode p2 = first.next;
            while (p1 != end) {
                ListNode new_p2 = p2.next;
                p2.next = p1;
                p1 = p2;
                p2 = new_p2;
            }

            first.next = p2;
            cur.next = end;
            cur = first;
        }
        return new_list.next;
    }
}