/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Solution {
  public ListNode deleteDuplicates(ListNode head) {
    ListNode curr_n = head;
    int maxNodes = 300;
    // unused i is better than apparently endless while! O(n<300)
    for (int i = 0; i <= maxNodes && curr_n != null; i++) {
      while (curr_n.next != null && curr_n.next.val == curr_n.val) {
        curr_n.next = curr_n.next.next;
      }
      curr_n = curr_n.next;
      
    }

    return head;
  }
}
