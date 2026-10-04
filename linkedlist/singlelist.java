public class singlelist {
    public static void main(String[] args) {

        singlelinkedlist list=new singlelinkedlist();
      list.insertfirst(20);
      list.insertfirst(30);
      list.insertfirst(80);
      list.insert(100);
      list.insert(1001);
      
        if(list.isempty())
        {
            System.out.print("list is empty !");
        }
        else
        {
            list.display();
        }

    }
}
class Node{
    int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
       
       
    }
    public void display()
    {
        System.out.print(data+"  ");
    }
}
class singlelinkedlist{
Node first;

public boolean isempty()
{
    return(first==null);
}

public void insertfirst(int data)
{
    Node newnode=new Node(data);
    newnode.next=first;
    first=newnode;
}

public Node deletefirst()
{
    if(first==null)
    {
System.out.print("list is empty");
return null;
    }else
    {
        
    
    Node temp=first;
    first=first.next;
    return temp;
    }
}
public void display()
{
    Node current=first;
    while(current!=null)
    {
        current.display();
        current=current.next;
    }
}

public void insert(int data)
{

Node newnode=new Node(data);
if(first==null)
{
    first=newnode;
}else
{
Node temp=first;
while(temp.next!=null)
{
temp=temp.next;
}
temp.next=newnode;

}


}

}