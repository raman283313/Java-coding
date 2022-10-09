import java.lang.*;
import java.io.*;
class Circle
{
public static void main(String args[])throws Exception
{
double r,ar,dia,circum;
DataInputStream ob=new DataInputStream(System.in);
System.out.print("Enter radius of circle:->");
r=Double.parseDouble(ob.readLine());
ar=(double)22/7*r*r;
dia=2*r;
circum=2*(double)22/7*r;
System.out.println("Area of circle="+ar);
System.out.println("Diameter of circle="+dia);
System.out.println("Circumference of circle="+circum);
}
}