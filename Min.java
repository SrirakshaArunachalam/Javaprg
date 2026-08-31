//program to find the smallest element of the array using for each loop
import java.util.Scanner;
public class Min{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
int n;
System.out.println("Enter no of array elements: ");
n=s.nextInt();
Scanner sc=new Scanner(System.in);
int arr[]=new int[n];
System.out.println("Enter the array elements: ");
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
int min=arr[0];
for(int i:arr)
{
//int min=arr[0];
if(i<min)
{
min=i;
}
}
System.out.println("Smallest array element: "+min);
}
}

