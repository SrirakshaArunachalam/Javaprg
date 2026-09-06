/* Steps to implement Runnable Interface
   1. create a class that implements runnable interface
   2. override run method to define the task 
   3. create a thread object by passing the Runnable Instance
4. call start() to execute the task in new thread*/

class demo{
public static void main(String[]args)
{
newThread r = new newThread();//creates an object for //newthread 
Thread t = new Thread(r);
t.start();
try
{
for(int i=0;i<5;i++)
{
System.out.println("Main Thread:"+i);
Thread.sleep(1000);
}
}
catch(InterruptedException e)
{
System.out.println("Main class is interrupted");
}
System.out.println("Have a nice day");
}
}


class newThread implements Runnable
{
public void run()
{
try
{
for(int i=0;i<5;i++)
{
System.out.println("Derived Thread:"+i);
Thread.sleep(500);
}
}
catch(InterruptedException e)
{
System.out.println("Derived class is interrupted");
}
System.out.println("Have a nice day");
}
}




