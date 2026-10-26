public class singlelist {
    public static void main(String[] args) {
        singlelinkedlist list=new singlelinkedlist();
        list.insert(10);
        list.insert(20);
        list.insertatfirst(5);
        list.insertatfirst(1);
        list.deletefirst();
        list.deletefirst();
        if(list.isempty())
        {
            System.out.print("list is empty!");
        }
        else
        {
            System.out.println("list is not empty!");
            list.display();
        }
       

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
    System.out.print(data+" ");
}
}
class singlelinkedlist{

    Node first;
    public boolean isempty()
    {
        return(first==null);
    }
    public void insert(int data)
    {
        Node newnode=new Node(data);
        if(first==null)
        {
            first=newnode;
        }
        else
        {
            Node temp=first;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newnode;
        }
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
    public void insertatfirst(int data)
    {
        Node newnode =new Node(data);
        newnode.next=first;
        first=newnode;
    }
    public Node deletefirst()
    {
        if(first==null)
            {
            return null;
    }else{
        Node temp=first;
        first=first.next;
        return temp;
    }
}

}







































// class Node{
//     int data;
//     Node next;
//     public Node(int data)
//     {
//         this.data=data;
       
       
//     }
//     public void display()
//     {
//         System.out.print(data+"  ");
//     }
// }
// class singlelinkedlist{
// Node first;

// public boolean isempty()
// {
//     return(first==null);
// }

// public void insertfirst(int data)
// {
//     Node newnode=new Node(data);
//     newnode.next=first;
//     first=newnode;
// }

// public Node deletefirst()
// {
//     if(first==null)
//     {
// System.out.print("list is empty");
// return null;
//     }else
//     {
        
    
//     Node temp=first;
//     first=first.next;
//     return temp;
//     }
// }
// public void display()
// {
//     Node current=first;
//     while(current!=null)
//     {
//         current.display();
//         current=current.next;
//     }
// }

// public void insert(int data)
// {

// Node newnode=new Node(data);
// if(first==null)
// {
//     first=newnode;
// }else
// {
// Node temp=first;
// while(temp.next!=null)
// {
// temp=temp.next;
// }
// temp.next=newnode;

// }


// }

// public Node find(int key)
//  {
//  Node current = first; 
// while (current != null) 
// { 
// if (current.data == key)
//  return current; 
// else
// current = current.next; 
// }
//  return null; }










//  public boolean deletebyvalue(int data)
//  {
//     if(first==null)
//     {
//         return false;
//     }
//     if(first.data==data)
//     {
//         first=first.next;
//         return true;
//     }
//     Node current=first;
// while(current.next!=null)
// {
//     if(current.next.data==data)
//     {
//         current.next=current.next.next;
//     }
//     current=current.next;
// }
// return false;

//  }

// }
