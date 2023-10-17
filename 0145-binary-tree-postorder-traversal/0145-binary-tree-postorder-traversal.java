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
      TreeNode t=root;
      if(t==null) return ans;
        Stack<TreeNode> s=new Stack<>();
        while(true)
        {
            while(t!=null)
            {
                if(t.right!=null) s.push(t.right);
                s.push(t);
                t=t.left;
            }
            if(s.size()!=0) t=s.pop();
            if(s.size()>=1 && s.peek()==t.right)
            {
                s.pop();
              s.push(t);
                t=t.right;
            }
            else
            {
                ans.add(t.val);
                t=null;
            }
            if(s.isEmpty()) break;
        }
        return ans;
    }      
}