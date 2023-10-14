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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode t=new TreeNode(val,null,null);
        if(root==null)
        {
            root=t;
            return root;
        }
        TreeNode j=new TreeNode();
        j=root;
        while(true)
        {
            if(t.val<j.val)
            {
              if(j.left==null)
              {
                  j.left=t;
                  break;
              }
                else
                {
                    j=j.left;
                }
            }
            else
            {
                if(j.right==null)
                {
                    j.right=t;
                    break;
                }
                else
                {
                    j=j.right;
                }
            }
        }
        return root;
    }
}