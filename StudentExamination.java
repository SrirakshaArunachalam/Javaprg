import java.util.Scanner;
class RangeException extends Exception
{
 RangeException(String s)
  {
   super(s);
  }
}
class Student
{
String name[];
int a[];
static void checkRange( int a[]) throws RangeException
{
for(int i=0;i<6;i++)
{
if(a[i]<0 || a[i]>100)
{
throw new RangeException("Marks must be in between 0 to 100");
}
}
for(int j=0;j<10;j++)
{
System.out.println(name[j]);
}
System.out.println("Student Mark in 6 subjects:");
for(int i=0;i<6;i++)
{
System.out.print(a[i]);
}
int total=0;
for(int i=0;i<6;i++)
{
total+=a[i];
}
float percentage=0.0f;
percentage=(float)(total/6.0);
System.out.println("Students total:"+total);
System.out.println("Students percentage:"+percentage);
}
}
public class StudentExamination{
public static void main(String[]args)
{
Scanner Sc=new Scanner(System.in);
for(int j=0;j<10;j++)
{
System.out.println("Enter the Student Name:");
String name= Sc.nextLine();
}
int a[]=new int[6];
System.out.println("Enter Student 6 subject Marks:");
for(int i=0;i<6;i++)
{
 a[i]=Sc.nextInt();
}
try
{
Student.checkRange(a);
}
catch(RangeException r)
{
System.out.println("Mark is not within the Range:");
System.out.println("Exception:"+r.getMessage());
}
}
}

