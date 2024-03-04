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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode p1=head,p2=head;
        while(p2!=null)
        {
            while(p1!=null && p2.val==p1.val) p1=p1.next;
            p2.next=p1;
            p2=p1;
        }
        return head;
        
    }
}