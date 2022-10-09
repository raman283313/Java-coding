//Example of Interface:->
import java.io.*;
import java.lang.*;
import java.util.*;
interface Area
{
public final double PI=(double)22/7;
public double area(double x);
public double area(double x,double y);
}
class CircleArea implements Area
{
public double area(double x)
{
return(PI*x*x);
}
public double area(double x,double y)
{
return(0);
}
}
class RectangleArea implements Area
{
public double area(double x,double y)
{
return(x*y);
}
public double area(double x)
{
return(0);
}
}
class FindArea
{
public static void main(String args[])
{
double r,len,wid,ar;
Scanner ob=new Scanner (System.in);
System.out.print("Enter radius of circle:->");
r=ob.nextDouble();
Area obj;
obj=new CircleArea();
ar=obj.area(r);
System.out.print("Area of circle="+ar);
System.out.print("\nEnter lenght and width of rectangle:->");
len=ob.nextDouble();
wid=ob.nextDouble();
obj=new RectangleArea();
ar=obj.area(len,wid);
System.out.print("Area of rectangle="+ar);
}
}