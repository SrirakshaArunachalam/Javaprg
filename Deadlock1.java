class A{
    synchronized void foo(B b)
    {
        System.out.println(Thread.currentThread().getName()+"entered A foo");//Gets the thread that is currently running and get its name
        try{
            Thread.sleep(100);
        } 
        catch(Exception e)
        {}
        System.out.println(Thread.currentThread().getName()+"Access B.last()");
b.last();//MainThread is trying to call the last() method of object b
    }
    synchronized void last()
    {
        System.out.println("Inside A.last");
    }
}
class B{
    synchronized void bar(A a)
    {
        System.out.println(Thread.currentThread().getName()+"entered B.bar");
    
    try
    {
        Thread.sleep(100);
    }
    catch(Exception e)
    {}
    System.out.println(Thread.currentThread().getName()+" trying to call A.last()");
    a.last();
}
    synchronized void last()
    {
        System.out.println("Inside B.last");
    }
}

class Deadlock1 implements Runnable{
    A a = new A();
    B b = new B();
    Thread t;
    Deadlock1()
    {
        Thread.currentThread().setName("Main Thread");
        t= new Thread(this,"RacingThread");
    }
    void deadlockstart()
    {
        t.start();
        a.foo(b);//MainThread gets lock on a
    }
    public void run()
    {
        b.bar(a);//RacingThread gets lock on b
    }
    public static void main(String[]args)
    {
        Deadlock1 d1= new Deadlock1();
        d1.deadlockstart();
    }
} 