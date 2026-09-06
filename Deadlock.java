class Mythread1 extends Thread{
    Object a;
    Object b;
    Mythread1(Object a, Object b)
    {
        this.a=a;
        this.b=b;
    }
    public void run()
    {
        synchronized(a)
        {
            System.out.println("t1 locked a");
            try
            {
                Thread.sleep(100);
            }
            catch(Exception e)
            {
                synchronized(b)
                {
                    System.out.println("t1 locked b");
                }
            }
        }
    }
}
class Mythread2 extends Thread{
    Object a;
    Object b;
    Mythread2(Object a,Object b)
        {
this.a=a;
this.b=b;
        }
        public void run()
        {
            synchronized(b)
            {
                System.out.println("thread 2 locks b");
            }
            try{
                Thread.sleep(100);
            }
            catch(Exception e)
            {
            synchronized(a)
            {
                System.out.println("thread 2 locks a");
            }


            }
            }
        }
class Deadlock{
    public static void main(String[]args)
    {
        Object a = new Object();
Object b = new Object();
Mythread1 t1 = new Mythread1(a,b);
Mythread2 t2=new Mythread2(a,b);
t1.start();
t2.start();
    }
}
