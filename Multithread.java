class Raksha implements Runnable//creating a class that implements from the class runnable
{
private String name;
public Raksha(String n)// parametrized constructor
{
this.name=n;
}
public void run()
{
try
{
for(int i=1;i<=3;i++)
{
System.out.println(name+" processing item :"+i);
Thread.sleep(500);
}
}
catch(InterruptedException e)
{
System.out.println(name+"was interrupted:");
}
System.out.println(name+"has finished execution");
}
}
public class MultiThread{
public static void main(String[]args)
{
System.out.println("Main thread executes:");
Raksha r = new Raksha("Thread A");//creating instance of runnable class
Raksha R1= new Raksha("Thread B");
Thread t1=new Thread(r);//pass the runnable objects to thread class constructor
Thread t2=new Thread(R1);
t1.start();
t2.start();
System.out.println("Main thread is finished:");
}
}

