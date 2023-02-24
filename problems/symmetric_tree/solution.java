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
  private static void dfs1(TreeNode root, List<Integer> res){
    // left-wise dfs
    if(root == null){
      res.add(-1); return;
    } 
    res.add(root.val);
    dfs1(root.left, res);
    dfs1(root.right, res);
  }
  private static void dfs2(TreeNode root, List<Integer> res){
    // right-wise dfs
    if(root == null){
      res.add(-1); return;
    } 
    res.add(root.val);
    dfs2(root.right, res);
    dfs2(root.left, res);
  }
  public static boolean isSymmetric(TreeNode root) {
    // solving this is trivial if we use DFS
    if (root == null) return true;
    final TreeNode root1 = root.left, root2 = root.right;
    final List<Integer> output1 = new ArrayList<>(), output2 = new ArrayList<>();
    dfs1(root1, output1); dfs2(root2, output2); 
    return output1.equals(output2);
  }
}