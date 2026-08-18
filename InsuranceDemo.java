abstract class Vehicle
{
    int vehicleNo;
    String ownerName;
    int vehicleAge;
    float InsuredAmount;
    float premiumAmount;
abstract void getdetails();
abstract void calculatePremium();
abstract void display();
}
class CarInsurance extends Vehicle{
String Cartype;
CarInsurance(int no,String name, int age, float amoun)
{
    vehicleNo=no;
ownerName=name;
vehicleAge=age;
InsuredAmount=amoun;

}
void getdetails()
{

System.out.println("Enter the Vehicle no:"+vehicleNo);
System.out.println("Enter the Owner Name:"+ownerName);
System.out.println("Enter the Vehicle Age:"+vehicleAge);
System.out.println("Enter the Insured Amount:"+InsuredAmount);
//System.out.println("Enter the Premium Amount:");

}
void calculatePremium()
{
    if(vehicleAge<=5)
    {
premiumAmount=(4/100.0f)*InsuredAmount;

    }
    else
    {
        premiumAmount=(6/100.0f)*InsuredAmount;
    }
}
    void display()
    {
System.out.println("Premium Amount "+premiumAmount);
    }
}
class BikeInsurance extends Vehicle{
int enginecapacity;
BikeInsurance(int no,String name, int age, float amoun,int capacity)
{
    vehicleNo=no;
ownerName=name;
vehicleAge=age;
InsuredAmount=amoun;
enginecapacity=capacity;

}
void getdetails()
{

System.out.println("Enter the Vehicle no:"+vehicleNo);
System.out.println("Enter the Owner Name:"+ownerName);
System.out.println("Enter the Vehicle Age:"+vehicleAge);
System.out.println("Enter the Insured Amount:"+InsuredAmount);
//System.out.println("Enter the Premium Amount:");

}
void calculatePremium()
{
    if(enginecapacity<=150)
    {
premiumAmount=(2/100.0f)*InsuredAmount;

    }
    else
    {
        premiumAmount=(3.5/100.0)*InsuredAmount;
    }
}
void display()
{
    System.out.println("Premium Amount "+premiumAmount);

}
}
class InsuranceDemo
{
    public static void main(String[] args) 
    {
    Vehicle CarInsurance  =new CarInsurance(101,"r",3,5000);
  Vehicle BikeInsurance  =new BikeInsurance(01,"h",5,3000,151);
    CarInsurance.getdetails();
    CarInsurance.calculatePremium();
    CarInsurance.display();  
     BikeInsurance.getdetails();
    BikeInsurance.calculatePremium();
    BikeInsurance.display();    
    }
}