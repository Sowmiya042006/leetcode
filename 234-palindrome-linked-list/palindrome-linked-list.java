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
    public boolean isPalindrome(ListNode head) 
    {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode fh=head;
        ListNode sl=slow;
        

        ListNode cur=sl;
        ListNode prev=null;
        ListNode next=null;
        while(cur!=null)
        {
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        while(prev!=null)
        {
            if(fh.val!=prev.val)
            {
                return false;
            }
            fh=fh.next;
            prev=prev.next;
        }
        return true;

        

    }
}