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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return null;
        ListNode p1=head.next;
        ListNode p2=head;
        while(head!=null && head.val==val)
        {
            p1=head;
            head=head.next;
        }
        while(p1!=null)
        {
            if(p1.val==val)
            {
                p2.next=p1.next;
                p1=p2.next;
            }
            else 
            {
                p2=p1;
                p1=p1.next;
            }
        }
        return head;
    }
}