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
    public ListNode reverseList(ListNode head) {
        ListNode newHead=null;
        ListNode t;
        while(head!=null)
        {
            t=head;
            head=head.next;
            t.next=newHead;
            newHead=t;
        }
        return newHead;
    }
}