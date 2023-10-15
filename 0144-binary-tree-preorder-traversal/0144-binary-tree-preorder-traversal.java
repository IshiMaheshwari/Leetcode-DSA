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
    public List<Integer> preorderTraversal(TreeNode root) {
        TreeNode t=new TreeNode();
        t=root;
        List<Integer> ans=new ArrayList<>();
        preOrderTraversal(t,ans);
        return ans;
    }
   public void  preOrderTraversal(TreeNode t,List<Integer> ans)
   {
        if(t==null) return;
        ans.add(t.val);
        preOrderTraversal(t.left,ans);
        preOrderTraversal(t.right,ans); 
}
}