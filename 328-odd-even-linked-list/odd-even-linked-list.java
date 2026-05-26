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
    public ListNode oddEvenList(ListNode head) 
    {
      ListNode temp=head;
      ListNode oddhead=new ListNode();
      ListNode odd=oddhead;
      ListNode evenhead=new ListNode();
      ListNode even=evenhead;
      int c=1;
      while(temp!=null)
      {
        if(c%2!=0)
        {
            odd.next=temp;
            odd=odd.next;
        }
        else
        {
            even.next=temp;
            even=even.next;
        }
        c++;
        temp=temp.next;
      }
      even.next=null;
      odd.next=evenhead.next;
      return oddhead.next;

    }
}