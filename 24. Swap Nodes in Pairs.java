/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 /**
  * 算法
  * 1.添加虚拟头结点 new_list。
  * 2.定义 cur 指针初始指向 new_list。
  * 3.定义 first 为 cur->next，second 为 first->next；若 first 或 second 为空，则终止循环。
  * 4.按照一定的次序，修改 cur、first 和 second结点的 next 指针，具体参见代码。
  * 5.将 cur 指向修改后的 first，接着从第3步循环。
  */
  class Solution {
      public ListNode swapPairs(ListNode head) {
          ListNode new_list = new ListNode(0);
          new_list.next = head;
          ListNode cur = new_list;
          while(cur != null){
              ListNode first = cur.next;
              if (first == null){
                  break;
              }
              ListNode second = first.next;
              if (second == null){
                  break;
              }
              // 按照一定的次序，交换相邻的两个结点。
              cur.next = second;
              first.next = second.next;
              second.next = first;
              cur = first;
          }
          return new_list.next;
      }
  }