/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode new_list = new ListNode(0);
        new_list.next = head;
        ListNode p = new_list, s = new_list;
        while(n > 0 && p.next != null){
            p = p.next;
            n--;
        }
        while(p.next != null){
            p = p.next;
            s= s.next;
        }
        s.next = s.next.next;
        return new_list.next;
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode new_list = new ListNode(0);
        new_list.next = head;
        ListNode p = new_list, s = new_list;
        int count = 0;
        while(p.next != null){
            if(count > n - 1){//0到n-1 共n位
                s= s.next;
            }
            p = p.next;
            count++;
        }
        s.next = s.next.next;
        return new_list.next;
    }
}