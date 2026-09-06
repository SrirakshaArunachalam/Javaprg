class Queue
{
    int q[];
    int front,rear;
    boolean full,empty;
    Queue(int size)//constructor
    {
q= new int[size];//creates integer array of specifyed size
front=0;
rear=-1;
full=false;
empty=true;
    }
    //synchronized-->only one thread at a time can execute the method
    synchronized void put(int item)//method to put an item into the queue
    {
        while(full)
        {
            try
            {
                wait();//makes producer thread wait
                //wait()-->releases the lock so that consumer can enter the queue 
            }
            catch(Exception e)
            {
                System.out.println("Interrupted");
            }
        }
        rear=(rear+1)%q.length;//insert the item and %--> makes the queue circular
        q[rear]=item;
        if(rear==front)
        
            full=true;
        empty=false;
        System.out.println("Produced:"+item);
        notify();
    }
synchronized int get()
{
    while(empty)
    {
        try{
            wait();
        }
        catch(Exception e)
        {
            System.out.println("Interrupted");
        }
    }
    int item=q[front];
    front=(front+1)%q.length;
    full=false;
    if(front==(rear+1)%q.length)
        empty=true;
    System.out.println("consumed:"+item);
    notify();
    return item;
}
}
class producer implements Runnable
{
Queue q;
producer(Queue q)
{
    this.q=q;
}
public void run()
{
    for(int i=1;i<10;i++)
    {
        q.put(i);
        try{
            Thread.sleep(500);
        }
        catch(Exception e)
        {
            System.out.println("Interrupted");
        }
    }
}
}
class Consumer implements Runnable
{
Queue q;
Consumer(Queue q)
{
    this.q=q;
}
public void run()
{
    for(int i=1;i<10;i++)
    {
        q.get();
        try{
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
            System.out.println("Interrupted");
        }
    }
}
}
public class producerConsumer{
    public static void main(String[]args)
    {
        Queue q=new Queue(5);
        producer p=new producer(q);
        Consumer c= new Consumer(q);
        Thread producer=new Thread(p);
        Thread Consumer=new Thread(c);
        producer.start();
        Consumer.start();
    }
}