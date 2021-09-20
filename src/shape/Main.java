package shape;
import java.util.Scanner;
class Shape{
    public void area()
    {
        
    }
}
class Triangle extends Shape{
        double b, h;
    public void value(double b,double h)
    {
        this.b=b;
        this.h=h;
    }
    public void area()
    {
        double a=(0.5)*b*h;
        System.out.println("area of triangle is : "+a);
    }
}
class Circle extends Shape{
        double r;
    public void value1(double r)
    {
        this.r=r;
        
    }
    public void area()
    {
        double a=(0.5)*r*r;
        System.out.println("area of Circle is : "+a);
    }
}
public class Main
{
    public static void main(String args[]){
    	System.out.println("select shape for which area has to calculate 1.triangle 2.circle");
    	Scanner ac=new Scanner(System.in);
    	int a=ac.nextInt();
    	if(a==2)
    	{
	        Circle c =new Circle();
	        c.value1(5);
	        c.area();
    	}
    	if(a==1)
    	{
	        Triangle t =new Triangle();
	        t.value(8,3);
	        t.area();
    	}
    	else
    	{
    		System.out.println("wrong number");
    	}
    	
    }
}
