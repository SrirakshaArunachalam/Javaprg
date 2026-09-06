import java.util.*;
class Factorial implements Runnable{//class created
int fact;
Factorial(int fact)//constructor
{
this.fact=fact;
}
public void run()//method
{
long fact=1;
for(int i=1;i<=n;i++)
{
fact*=i;
}
System.out.println("Factorial of"+ fact+" is:"+fact);
}
}
class SumOfSeries implements Runnable{//class
int n;
SumOfSeries(int n)//constructor
{
this.n=n;
}
public void run()
{
int sum=0;
for(int i=0;i<=n;i++)
{
sum+=i;
}
System.out.println("sum of series "+ n +" is:"+sum);
}
}
class MultiplicationTable implements Runnable{//class
int n;
MultiplicationTable(int n)//constructor
{
this.n=n;
}
public void run()
{
//int sum=0;
System.out.println("Multiplication Table of "+ n );
for(int i=1;i<=10;i++)
{
System.out.println(n+"*"+i+"="+(n*i));
}
}
}
public class main
{
public static void main(String[]args)
{
int n,s,m;
System.out.println("Enter the value for factorial");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
System.out.println("Enter the value of Sum of series");
s=sc.nextInt();
System.out.println("Enter the value of Multiplication table");
m=sc.nextInt();
Factorial f1=new Factorial(n);
Thread t1=new Thread(f1);
SumOfSeries f2=new SumOfSeries(s);
Thread t2=new Thread(f2);
MultiplicationTable f3=new MultiplicationTable(m);
Thread t3=new Thread(f3);
t1.start();
t2.start();
t3.start();
}
}
