import java.util.Scanner;
class AgeMisMatchException extends Exception
{
AgeMisMatchException(String s)
{
super(s);
}
}
class Employee
{
int empId;
String empName;
int age;
static void addEmployee(int empId, String empName, int age) throws AgeMisMatchException
{
if(age<=18)
{
throw new AgeMisMatchException("Age must be greater than 18");
}
System.out.println("Employee Id is:"+empId);
System.out.println("Employee Name is:"+empName);
System.out.println("Employee age is:"+age);
}
}
public class EmployeeRegistration{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Employee Id:");
int empId= sc.nextInt();
sc.nextLine();
System.out.println("Enter Employee name:");
String empName=sc.nextLine();
System.out.println("Enter Employee Age:");
int age= sc.nextInt();
try
{
Employee.addEmployee(empId,empName,age);
}
catch(AgeMisMatchException a)
{
System.out.println("Employee Registration failed!");
System.out.println("Exception:"+ a.getMessage());
}
}
}





