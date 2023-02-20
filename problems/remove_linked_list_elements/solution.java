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
class Solution {
  public ListNode removeElements(ListNode head, int val) {
      if (head == null) return head;
      if (head.val == val && head.next == null) return null;
      
      int maxNodes = (int) Math.pow(10,4);
      ListNode newHead = new ListNode(0, head);
      ListNode prevNode = newHead;
      ListNode currNode = newHead.next;
      for (int i = 0; i < maxNodes && currNode != null; i++){
          if (currNode.val == val) prevNode.next = currNode.next; 
          else prevNode = currNode;
          currNode = currNode.next; 
      } 
      return newHead.next;
  }
}
