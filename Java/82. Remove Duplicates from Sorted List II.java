 /*
 * 1. 删掉遇到的所有重复node
 * 2. 判断当前节点与后一个节点值是否相等，相等则删掉
 * 3. 如果执行了删除操作则当前节点也删掉，否则处理下一个值
 * 4. 因为可能删除头结点，所以使用虚拟前置节点prev来规避，结果为prev.next
 */
 class Solution {
     public ListNode deleteDuplicates(ListNode head) {
         ListNode prev = new ListNode(0);
         prev.next = head;
         var p1 = prev;
         while (p1.next != null){
             boolean f = false;
             while (p1.next != null && p1.next.next != null && p1.next.val == p1.next.next.val ){
                 f = true;//标记此节点要删除
                 p1.next = p1.next.next;
             }
             if (f) {
                 p1.next = p1.next.next;
             } else {
                 p1 = p1.next;
             }
         }
         return prev.next;
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
      public ListNode deleteDuplicates(ListNode head) {
          ListNode new_list = new ListNode(0);
          new_list.next = head;
          ListNode cur = new_list;
          while(cur.next != null){
              ListNode q = cur.next;
              // 找到不想等为止
              while(q != null && cur.next.val == q.val){
                  q = q.next;
              }
              if(cur.next.next == q){
                  cur = cur.next;//cur后移
              }else{
                  cur.next = q;//删除重复元素
              }
          }
          return new_list.next;
      }
  }