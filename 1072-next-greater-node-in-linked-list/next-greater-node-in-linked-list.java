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
    public int[] nextLargerNodes(ListNode head) 
    {
        int c=0;
        ListNode cur=head;
        ListNode prev=null;
        ListNode next=null;
        while(cur!=null)
        {
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
            c++;
        }
        Stack<Integer>st=new Stack<>();
        st.push(prev.val);
        int r[]=new int[c];
        r[c-1]=0;
        c=c-2;
        ListNode temp=prev.next;
        while(temp!=null)
        {
           while(!st.isEmpty()&&st.peek()<=temp.val)
           {
            st.pop();
           }
           if(!st.isEmpty())
           {
            r[c--]=st.peek();
           }
           else
           {
            r[c--]=0;
           }
           st.push(temp.val);
           temp=temp.next;
        }
        return r;
    }
}