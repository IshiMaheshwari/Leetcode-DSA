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
        List<Integer> ls=new ArrayList<>();
        Stack<TreeNode> s=new Stack<>();
        t=root;
        if(t==null) return ls;
        if(t!=null)
        {
            s.push(t);
        }
        while(!s.isEmpty())
        {
            t=s.pop();
            ls.add(t.val);
            if(t.right!=null) s.push(t.right);
            if(t.left!=null) s.push(t.left);
        }
        return ls;
    }
}