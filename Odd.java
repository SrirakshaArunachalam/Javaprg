//program to display odd and even nos from 1 to 1000
import java.util.Scanner;
public class Odd{
public static void main(String[]args)
{
int n;
System.out.println("The even nos are: ");
for(int i=1;i<=1000;i++)
{
n=i%2;
if(n==0)
{
System.out.print(i+" ");
}
}
System.out.println();
System.out.println("The odd nos are: ");
for(int i=1;i<1000;i++)
{
n=i%2;
if(n!=0)
{
System.out.print(i+" ");
}
}
}
}




