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
import java.util.ArrayList;
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        int maxNodes = 5000; //5000;
        ListNode prevN = null, currN = head, nextN;
        
         
        //                         prev  currN  nextN
        for (int i = 0; i < maxNodes && currN != null; i++){     
        //                          *     1 ->
            nextN = currN.next; //  *     1 ->   2  ->   3
            currN.next = prevN; //  *  <- 1      2  ->   3
            prevN = currN; // *  <- 1  -- 1      2  ->   3
            currN = nextN; // *  <- 1    2  --   2  ->   3
        } 
         
        
        return prevN;
    }
}