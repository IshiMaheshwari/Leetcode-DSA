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
    public int sumOfLeftLeaves(TreeNode root) {
      return sumLeftNodes(root,false);
    }
    public int sumLeftNodes(TreeNode root,boolean b)
    {
        TreeNode t=root;
        if(t==null) return 0;
         int leftSum=sumLeftNodes(t.left,true); 
        if(b && t.left==null && t.right==null) return t.val;
        int rightSum=sumLeftNodes(t.right,false);
        return leftSum+rightSum;
        
    }
}