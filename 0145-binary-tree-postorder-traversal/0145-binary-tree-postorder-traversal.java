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
    public List<Integer> postorderTraversal(TreeNode root) {
      List<Integer> ans=new ArrayList<>();
      postOrderTraversal(root,ans);  
      return ans;
    }
   public void postOrderTraversal(TreeNode root,List<Integer> ans)
   {
       TreeNode t=root;
       if(t==null) return;
       postOrderTraversal(t.left,ans);
       postOrderTraversal(t.right,ans);
       ans.add(t.val);
   }
}