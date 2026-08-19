package shape2d;

public class Rectangle1 implements TwoD1{
    
    double length;
    double breadth;
    public Rectangle1(double length,double breadth)
    {
        this.length=length;
        this.breadth= breadth;
    }
    public double area()
    {
        return length*breadth;
    }
    public double perimeter()
    {
        return 2*(length+breadth);
    }
}
