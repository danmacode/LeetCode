# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def preorderTraversal(self, root: TreeNode) -> List[int]:
        if not root:
            return []
        r: List[int] = []
        nodes: List[TreeNode] = [root]
        while nodes:
            current: TreeNode = nodes.pop()
            r.append(current.val)
            if current.right:
                nodes.append(current.right)
            if current.left:
                nodes.append(current.left)
            
        return r