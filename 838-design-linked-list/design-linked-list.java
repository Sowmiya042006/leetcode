class MyLinkedList 
{
    class Node
    {
        int val;
        Node next;
        Node(int val)
        {
            this.val=val;
        }
    }
    Node head,tail;
    int c;
    public MyLinkedList()
    {
        head=tail=null;
        c=0;
    }
    public int get(int index) 
    {
        if(index<0 || index>=c)
        {
            return -1;
        }
        Node temp=head;
        for(int i=0;i<index;i++)
        {
            temp=temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) 
    {
       Node n=new Node(val);
       if(head==null)
       {
        head=n;
        tail=n;
       }
       else
       {
        n.next=head;
        head=n;
       }
       c++;
        
    }
    public void addAtTail(int val) 
    {
        Node n=new Node(val);
        if(head==null)
        {
            head=n;
            tail=n;
        }
        else
        {
            tail.next=n;
            tail=n;
        }
        c++;
    }
    
    public void addAtIndex(int index, int val) 
    {
        Node n=new Node(val);
        if(index<0 || index>c)
        {
            return;
        }
        if(index==0)
        {
           addAtHead(val);
           return;
        }
        else if(index==c)
        {
            addAtTail(val);
            return;
        }
        else
        {
             Node temp=head;
            for(int i=0;i<index-1;i++)
            {
                temp=temp.next;
            }
            n.next=temp.next;
            temp.next=n;
        }
        c++;
        
    }
    
    public void deleteAtIndex(int index)
    {
        Node temp=head;
        if(index<0 || index>=c)
        {
            return;
        }
        if(index==0)
        {
            head=head.next;
            if(head==null)
            {
                tail=null;
            }
            c--;
        }
        else
        {
            for(int i=0;i<index-1;i++)
            {
                temp=temp.next;
            }
            temp.next=temp.next.next;
            c--;
            if(temp.next==null)
            {
                tail=temp;
            }
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */