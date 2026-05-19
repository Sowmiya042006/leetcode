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
        ListNode rev=null;
        ListNode ori=head;
        ListNode s=head;
        while(s!=null)
        {
            ListNode n=new ListNode();
            n.val=s.val;
            n.next=rev;
            rev=n;
            s=s.next;
        }
        while(rev!=null && ori!=null)
        {
            if(rev.val!=ori.val)
            {
                return false;
            }
            rev=rev.next;
            ori=ori.next;
        }
        return true;
        
    }
}