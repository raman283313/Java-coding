//WAP to find out area and perimeter of rectangle
import java.io.*;
class Rectangle
{
public static void main(String args[])
{
float len, wid,arr,peri;
DataInputStream ob=new DataInputStream(System.in);
try
{
System.out.print("enter lenght of rectnagle:-");
len=Float.parseFloat(ob.readLine());
System.out.print("enter width of rectangle:-");
wid=Float.parseFloat(ob.readLine());
arr=len*wid;
peri=2*(len+wid);
System.out.print("area of rectangle="+arr);
System.out.print("\nperimeter of rectangle="+peri);
}
catch(Exception exp)
{
}
}
}