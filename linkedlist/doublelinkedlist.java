public class doublelinkedlist{

    public static void main(String []args)
    {
    doublelist newlist=new doublelist();
    newlist.insertfirst(10);
    newlist.insertfirst(5);
    newlist.insertlast(20);
    newlist.insertlast(30);
    newlist.deletefirst();
    newlist.deletelast();
    newlist.displayfarward();
    System.out.println();
    newlist.displaybackward();
    
    }
}
class Node {
    int data;
    Node next;
    Node prev;
Node (int data)
{
    this.data=data;
}
public void display()
{
    System.out.print(data+"  ");
}

}
class doublelist{
    Node head;
    Node tail;
    public void insertfirst(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=tail=newnode;
        }else{
            newnode.next=head;
            head.prev=newnode;
            head=newnode;
        }

    }
    public void insertlast(int data)
    {
        Node newnode=new Node(data);
        if(tail==null)
        {
           head=tail=newnode;
        }else{
tail.next=newnode;
newnode.prev=tail;
tail=newnode;

        }
    }
    public void displayfarward()
    {
        Node temp=head;
        while(temp!=null)
        {
            temp.display();
            temp=temp.next;
        }

    }
    public void displaybackward()
    {
        Node temp=tail;
        while(temp!=null)
        {
            temp.display();
            temp=temp.prev;
        }
    }
    public void deletefirst()
    {
        if(head==null)
        {
            System.out.println("list is empty!");
        }
        if(head==tail)
        {
            head=tail=null;
        }else
        {
            head=head.next;
            head.prev=null;
        }
    }

    public void deletelast()
    {
        if(tail==null)
        {
            System.out.println("list is empty!");
        }
        if(tail==head)
        {
            head=tail=null;
        }else
        {
            tail=tail.prev;
            tail.next=null;
        }
    }
}


