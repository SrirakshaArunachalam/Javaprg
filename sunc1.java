class cakecounter
{
    int cakecount=0;
    public void increment()
    {
        synchronized(this)
        {
        cakecount++;
        }
    }
}
class team implements Runnable
{
    cakecounter c;
    team(cakecounter c)
    {
        this.c=c;
    }
    public void run()
    {
        for(int i=0;i<1000;i++)
        {
            c.increment();
        }
    }
}
class sunc1{
    public static void main(String[] args) {
        
            cakecounter c=new cakecounter();
            team t1=new team(c);
            team t2=new team(c);
Thread team1=new Thread(t1);
Thread team2=new Thread(t2);
team1.start();
team2.start();
try{
    team1.join();
    team2.join();
}
catch(Exception e)
{
    System.out.println(e);
}
        System.out.println(c.cakecount);
    }
}