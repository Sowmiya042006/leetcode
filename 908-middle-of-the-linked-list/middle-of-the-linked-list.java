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
class Solution 
{
    public ListNode middleNode(ListNode head) 
    {
        ListNode temp=head;
        ListNode t=head;
        int c=0;
        while(t!=null)
        {
          t=t.next;
          c++;
        }
        int l=c/2;
        while(l!=0)
        {
            head=head.next;
            l--;
        }
        return head;
    }
}