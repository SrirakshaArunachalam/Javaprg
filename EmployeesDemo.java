interface print{
void display();
}
abstract class Employee implements print{
String name;
int id;
Employee(String name, int id)//constructor is created
{
this.name=name;
this.id=id;
}
abstract void calculate();
}
class Manager extends Employee
{
float salary;
float bonus;
float allowance;
Manager(String name, int id,float salary, float bonus, float allowance)
{
super(name,id);
this.salary=salary;
this.bonus=bonus;
this.allowance=allowance;
}
void calculate()
{
double total;
total=salary+bonus+allowance;
System.out.println("Salary of the Employee is:"+salary);
System.out.println("Bonus of the Employee is:"+bonus);
System.out.println("Allowance of the Employee is:"+allowance);
System.out.println("Total salary of the Employee is:"+total);
}
public void display()
{
System.out.println("Name of the Employee is:"+name);
System.out.println("Id of the Employee is:"+id);
}
}
public class EmployeesDemo{
public static void main(String[]args)
{
Manager m= new Manager("ram",101,1234,4567,90);
try
{
m.display();
m.calculate();
int a=100;
int b=0;
int r=(a/b);
System.out.println("Result:"+r);
}
catch (ArithmeticException e) {
System.out.println("Exception occurred: Cannot divide by zero");
System.out.println("Exception Type: " + e.getClass().getSimpleName());
}
finally
{
System.out.println("Program Demonstrates interface and inheritance with exception:");
}
}
}
