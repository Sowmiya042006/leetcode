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
    public ListNode swapPairs(ListNode head) 
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode temp=head;
        ListNode prev=null;
        int c=0;
        while(temp!=null && temp.next!=null)
        {
            ListNode t=temp.next;
            temp.next=temp.next.next;
            t.next=temp;
            if(prev!=null)
            {
                prev.next=t;
            }
            prev=temp;
            temp=temp.next;
            if(c==0)
            {
                head=t;
            }
            c++;
        }
        return head;
    }
}