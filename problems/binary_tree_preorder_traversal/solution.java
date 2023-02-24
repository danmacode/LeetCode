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
/** Why Oh Why
 * Don't know why, but recursive fn sometimes reach 
 * better results in LeetCode, so here's my edit...
 */

class Solution {
  static void dfs(TreeNode root, List<Integer> res){
    // static recursive Depth-first search (DFS)
    // the ArrayList declaration is in the main fn 
    if(root == null) return;
    res.add(root.val);
    dfs(root.left, res);
    dfs(root.right, res);
  }
  public List<Integer> preorderTraversal(TreeNode root) {
    final List<Integer> output = new ArrayList<>();
    dfs(root, output); 
    return output;
  }
}