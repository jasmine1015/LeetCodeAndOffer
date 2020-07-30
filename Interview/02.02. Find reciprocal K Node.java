/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int kthToLast(ListNode head, int k) {
        if(head == null){
            return head.val;
        }
        ListNode fast = head;
        // for(int i = 0; i < k; i++){
        //     fast = fast.next;
        // }
        // int i = 0;
        while(k > 0){
            if(fast == null){
                return 0;
            }
            fast = fast.next;
            // i++;
            k--;
        }

        while(fast != null){
            fast = fast.next;
            head = head.next;
        }
        return head.val;
    }
}