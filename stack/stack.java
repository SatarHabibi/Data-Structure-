public class stack{
    public static void main(String args[])
    {
newstack ourstack=new newstack(10);
ourstack.push(10);
ourstack.push(20);

if(ourstack.isempty())
{
    System.err.println("stack is empty!");

}else{
System.err.println("stack is not empty!");
System.out.println(ourstack.peek());
System.out.println(ourstack.peek());
}

    }
}
class newstack{
    int top;
    int size;
    int array[];

    newstack(int size)
    {
       array=new int[size]; 
       top=-1;
    }

    public boolean isempty()
    {
        return (top==-1);
    }
    public boolean isfull()
    {
        return(top==size-1);
    }
    public void push(int data)
    {
        array[++top]=data;
    }
    public int pop()
    {
        return array[top--];
    }
    public int peek()
    {
        return array[top];
    }
}