import java.util.Scanner;
abstract class Employee
{
String Name;
int id;
Employee(String Name, int id)//Constructor is created
{
this.Name=Name;
this.id=id;
}
abstract void calculateSalary();//abstract method
}
class Manager extends Employee
{
float salary;
float bonus;
Manager(String Name, int id, float salary, float bonus)
{
super(Name,id);
this.salary=salary;
this.bonus=bonus;
}
void calculateSalary()
{
try
{
if(salary<0||bonus<0)
{
throw new ArithmeticException("Salary or the Bonus must be positive");
}
float total;
total=salary+bonus;
System.out.println("Name of the Employee is:"+Name);
System.out.println("Id of the Employee is:"+id);
System.out.println("Salary of the Employee is:"+salary);
System.out.println("Bonus of the Employee is:"+bonus);
System.out.println("Total salary of the Employee is:"+total);
}
catch(ArithmeticException a)
{
System.out.println("Error:"+a.getMessage());
}
}
}
public class Employeedetails{
public static void main(String[]args)
{
//Manager m1 = new Manager("Raj", 101, 50000, 10000);
//m1.calculateSalary();
//System.out.println("\n--- Invalid Salary Example ---");
//Manager m2 = new Manager("Kumar", 102, -50000, 5000);
//m2.calculateSalary();
Scanner sc= new Scanner(System.in);
System.out.println("Enter Manager Name:");
String Nam=sc.nextLine();
System.out.println("Enter Manager id:");
int i=sc.nextInt();



System.out.println("Enter Manager Salary:");
float Salar=sc.nextFloat();

System.out.println("Enter Manager bonus:");
float bonu=sc.nextFloat();
sc.nextLine();
Manager m1= new Manager(Nam,i,Salar,bonu);
m1.calculateSalary();
System.out.println("Enter Manager Name:");
String Nam1=sc.nextLine();
System.out.println("Enter Manager id:");
int id=sc.nextInt();
System.out.println("Enter Manager Salary:");
float Salar1=sc.nextFloat();
System.out.println("Enter Manager bonus:");
float bonu1=sc.nextFloat();
Manager m2= new Manager(Nam,id,Salar1,bonu1);
m2.calculateSalary();
sc.close();
}
}






