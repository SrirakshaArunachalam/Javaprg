//program to calculate the sum of digits of the number using methods
import java.util.Scanner;
public class Sum{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter a number: ");
n=sc.nextInt();
sum(n);
}
public static void sum(int n)
{
int sum=0;
while(n>0)	
{
int a=n%10;
sum=sum+a;
n=n/10;
}
System.out.println("Sum of digits of a no is:"+sum);
}
}
