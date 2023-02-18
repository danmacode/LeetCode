# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        r = curr_n = head

        while(curr_n and curr_n.next):
            if curr_n.val == curr_n.next.val:
                curr_n.next = curr_n.next.next
            else:
                curr_n = curr_n.next
        return r
