/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
  // always static
  public static int maxDepth(TreeNode root) {
    // Level Order Traversal approach
    if (root == null) return 0;
    final int maxNodes = (int) Math.pow(10, 4);
    final Deque<TreeNode> nodeStack = new ArrayDeque<>(10);
    nodeStack.add(root);
    int depth = 0;
    for (int i = 0; i < maxNodes && !nodeStack.isEmpty(); i++) {
      final int treeSize = nodeStack.size();
      for (int k = 0; k < treeSize; k++) {
        TreeNode curr = nodeStack.poll(); // remove 1st elem. | null
        if (curr.left != null) nodeStack.add(curr.left);
        if (curr.right != null) nodeStack.add(curr.right);
      }
      depth++;
    }

    return depth;
  }
}
