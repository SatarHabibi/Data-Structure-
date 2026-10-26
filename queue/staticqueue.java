public class staticqueue{

    public void main(String args[])
    {

        queue ourqueue=new queue(3);
        ourqueue.enqueue(10);
        ourqueue.enqueue(20);
        ourqueue.enqueue(30);
       System.out.println(ourqueue.dequeue());
       System.out.println(ourqueue.dequeue());
       ourqueue.enqueue(40);
       ourqueue.enqueue(50);
        

        if(ourqueue.isfull())
        {
            System.out.println("queue is full!");
        }else
        {
            System.out.println("queue is not full!");
        }
    }
}
class queue{
int front;
int rear;
int size;
int array[];

queue(int size){
array=new int[size];
this.size=size;
front=0;
rear=-1;

}


public void enqueue(int data)
{
    if(isfull())
    {
        System.out.println("queue is full");
    }
    array[++rear]=data;
}
public int dequeue()
{
    if(isempty())
    {
        System.out.println("queue is empty!");
    }
    rear--;
    return array[front++];
}
public boolean isempty()
{
    return front>rear;
}
public boolean isfull()
{
    return rear==size-1;
}

}