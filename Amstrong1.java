//program to check if a given number is amstrong or not using method
import java.util.Scanner;
import java.lang.Math;
public class Amstrong1{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number: ");
int s=sc.nextInt();
//int temp=n;
arm(s);
}
static void arm(int n)
{
int temp=n;
int arn=0,digits=0;
for(int i=temp;i!=0;i=i/10)
{
digits++;
temp=n;
}
for(int i=temp;i!=0;i=i/10)
{
int value=i%10;
arn=arn+(int)Math.pow(value,digits);
}
if(arn==n)
{
System.out.println(n+" is an Amstrong number: ");
}
else
{
System.out.println(n+" is not an Amstrong number: ");
}
}
}

