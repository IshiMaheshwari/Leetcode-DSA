/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> s=new Stack<>();
        ListNode t=head;
        while(t!=null)
        {
            s.push(t.val);
            t=t.next;
        }
        ListNode k=head;
            while(k!=null)
            {
                int i=s.pop();
                if(i!=k.val)
                {
                    return false;
                }
                k=k.next;
            }
        return true;
    }
}