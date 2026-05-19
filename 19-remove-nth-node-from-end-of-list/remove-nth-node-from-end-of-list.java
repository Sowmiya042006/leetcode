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
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        ListNode temp=head;
        ListNode t=head;
        int c=1;
        while(t.next!=null)
        {
            t=t.next;
            c++;
        }
        n=c-n;
        while(n!=1 && temp!=null) 
        {
            temp=temp.next;
            n--;
        }
        if(temp==null )
        {
            return head.next;
        }
        else if(temp.next==null)
        {
            head.next=null;
            return head;
        }
        else
        {
            temp.next=temp.next.next;
        }
        return head;
    }
}