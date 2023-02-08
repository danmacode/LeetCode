# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(
        self, list1: Optional[ListNode], list2: Optional[ListNode]
    ) -> Optional[ListNode]:
        r_head = ListNode()  # head that stores the ordered list
        r = r_head  # current node

        # while both lists have elements fill the ordered list
        while list1 and list2:
            if list1.val <= list2.val:
                r.next = list1
                list1 = list1.next
            else:
                r.next = list2
                list2 = list2.next
            # advance the ordered list
            r = r.next
        # if a list was emptied, append the other
        r.next = list1 if not list2 else list2

        return r_head.next
