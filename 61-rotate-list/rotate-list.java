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

    public ListNode rotateRight(ListNode head, int k) 
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        int size=1;
        ListNode t=head;
        while(t.next!=null)
        {
            size++;
            t=t.next;
        }
        k=k%size;
        for(int i=k;i>0;i--)
        {
             ListNode temp=head;
            ListNode prev=null;
            while(temp.next!=null)
            {
                if(temp.next!=null && temp.next.next==null)
                {
                  prev=temp;
                }
                temp=temp.next;
            }
            prev.next=null;
            temp.next=head;
            head=temp;
            
        }
        return head;
        
    }
}