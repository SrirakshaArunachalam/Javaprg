//program to find the cubic value of a given number
import java.util.Scanner;
public class Cubic{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter a number: ");
n=sc.nextInt();
int r;
//r=(n*n*n);
r=(int)Math.pow(n,3);
System.out.println("The cube of no: "+r);
}
}