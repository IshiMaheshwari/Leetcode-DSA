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
    public int maxDepth(TreeNode root) {
       TreeNode t=root;
        if(t==null) return 0;
        int rh,lh;
        lh=maxDepth(t.left);
        rh=maxDepth(t.right);
        return (lh>rh)?lh+1:rh+1;
    }
}