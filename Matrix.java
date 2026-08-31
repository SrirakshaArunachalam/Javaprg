//nested for to display the matrix
import java.util.Scanner;
public class Matrix{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
int n;
System.out.println("Enter no of rows: ");
n=s.nextInt();
Scanner st=new Scanner(System.in);
int n2;
System.out.println("Enter no of cols: ");
n=st.nextInt();
Scanner sc=new Scanner(System.in);
int arr[]=new int[n];
System.out.println("Enter the array elements: ");
for(int i=0;i<n;i++)
for(int j=0;j<n;j++)
{
arr[i]=sc.nextInt();
}
System.out.println("array elements are:");
for(int i=0;i<n;i++)
for(int j=0;j<n;j++)
{
System.out.println(arr[i]);
}
System.out.println();
}
}
