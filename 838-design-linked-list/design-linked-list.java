class MyLinkedList 
{
    class Node
    {
        int val;
        Node prev;
        Node next;
        Node(int val)
        {
            this.val=val;
        }
    }
    int c;
    Node head;
    Node tail;
    public MyLinkedList() 
    {
        c=0;
        head=null;
        tail=null;
        
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
            head.prev=n;
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
            n.prev=tail;
            tail=n;
        }
        c++;
    }
    
    public void addAtIndex(int index, int val) 
    {
        if(index<0 || index>c)
        {
            return;
        }
        if(index==0)
        {
            addAtHead(val); 
        }
        else if(index==c)
        {
            addAtTail(val);
        }
        else
        {
            Node temp=head;
            Node n=new Node(val);
            for(int i=0;i<index-1;i++)
            {
                temp=temp.next;
            }
            n.prev=temp;
            n.next=temp.next;
            temp.next=n;
            n.next.prev=n;
            c++;
        }
    
        
    }
    
    public void deleteAtIndex(int index) 
    {
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
            else
            {
                head.prev=null;
            }
            c--;
        }
        else if(index==c-1)
        {
            tail=tail.prev;
            if(tail==null)
            {
                head=null;
            }
            else
            {
                tail.next=null;
            }
            c--;
        }
        else
        {
            Node temp=head;
            for(int i=0;i<index-1;i++)
            {
                temp=temp.next;
            }
            temp.next=temp.next.next;
            temp.next.prev=temp;
            c--;
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