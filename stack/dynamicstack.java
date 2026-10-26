public class dynamicstack {
    
    public void main(String args[])
    {
stacklist ourstack=new stacklist();

ourstack.push(10);
ourstack.push(20);
ourstack.push(30);
ourstack.display();
System.out.println();
System.out.println(ourstack.peek());
ourstack.display();

    }
}
class Node{
int data;
Node next;
Node(int data){
this.data=data;
}
void display()
{
    System.out.print(data+"   ");
}
}
class linkedlist{
    Node first;
public void insertfirst(int data){
    Node newnode=new Node(data);
    if(first==null)
    {
        first=newnode;
    }else{
newnode.next=first;
first=newnode;
    }
}
    public int deletefirst()
    {
        Node temp=first;
        first=first.next;
        return temp.data;
    }
    public int showlast()
    {
        return first.data;
    }

    public void display()
    {
        Node temp=first;
        while(temp!=null)
        {
            temp.display();
            temp=temp.next;
        }
    }
    
}

class stacklist{
    linkedlist thelist;
    stacklist()
    {
        thelist=new linkedlist();
    }
    public void push(int data)
    {
        thelist.insertfirst(data);
    }
    public int pop()
    {
        return thelist.deletefirst();
    }
    public int peek()
    {
      return thelist.showlast();
    }
    public void display()
    {
        thelist.display();
    }
}
