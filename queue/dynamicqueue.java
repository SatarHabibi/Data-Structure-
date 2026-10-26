public class dynamicqueue{
    public static void main(String[] args) {
        queuelist ourqueue=new queuelist();
        ourqueue.enqueue(10);
        ourqueue.enqueue(30);
        ourqueue.enqueue(40);
        ourqueue.enqueue(50);
         ourqueue.display();
        System.out.println("value is deleetd:"+ourqueue.dequeue());
        
    }
}
class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
    }
    public void display()
    {
        System.out.print(data+"  ");
    }
}
class linkedlist{
Node rear;
Node front;

public void insertlast(int data)
{
    Node newnode=new Node(data);
    if(rear==null)
    {
        rear=front=newnode;
    }else
    {
        rear.next=newnode;
        rear=newnode;
    }
}
public int deletefirst()
{
    Node temp=front;
    front=front.next;
    return temp.data;
}
public boolean isempty()
{
    return (rear==null);
}

 public void display()
    {
        Node temp=front;
        while (temp!=null) {
            temp.display();
            temp=temp.next;
        }
    }


}
class queuelist{

    linkedlist thelist;
    queuelist()
    {
        thelist=new linkedlist();
    }
public void enqueue(int data)
{
    thelist.insertlast(data);
}
public int dequeue()
{
    return thelist.deletefirst();
}
public boolean isempty()
{
    return thelist.isempty();
}
public void display()
{
    thelist.display();
}
}
