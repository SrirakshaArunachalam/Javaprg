class callme{
    void call(String msg)
    {
        System.out.print("["+msg);
        try{
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}
class caller implements Runnable
{
    String msg;
    callme target;
    Thread t;
    public caller(callme targ,String s)
    {
        target = targ;
        msg=s;
        t=new Thread(this);//this has current caller object 
    }
    public void run()
    {
        target.call(msg);
    }

}
class synch
{
    public static void main(String[]args)
    {
        callme target = new callme();
        caller obj1= new caller(target,"Hello");
        caller obj2= new caller(target,"Synchronized");
        caller obj3= new caller(target,"world");
obj1.t.start();
obj2.t.start();
obj3.t.start();
try{
    obj1.t.join();
    obj2.t.join();
    obj3.t.join();
}
catch(Exception e)
{
    System.out.println("Interrupted");
}
    }
}