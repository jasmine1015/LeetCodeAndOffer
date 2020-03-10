/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k <= 0) return head;
        ListNode first = head;
        int count = 1;
        //计算链表的长度
        while(first.next != null){
            first = first.next;
            count++;
        }
        first.next = head;//构成一个环
        int n = count - k % count;
        if(n == 0) return head;
        ListNode second = first;
        while(n > 0){
            second = second.next;
            n--;
        }
        ListNode new_list = second.next;
        second.next = null;
        return new_list;
    }
}