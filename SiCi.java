//WAP to find out SI and CI?
import java.io.*;
import java.util.*;
import java.lang.*;
class SiCi
{
public static void main(String arg[])
{
double p,rate,time,si,ci;
Scanner ob=new Scanner(System.in);
System.out.print("Enter Principle amount,rate of interest and time:->");
p=ob.nextDouble();
rate=ob.nextDouble();
time=ob.nextDouble();
si=p*rate*time/100;
ci=p*Math.pow((1+(rate/100)),time)-p;
System.out.println("Simple Interest="+si);
System.out.println("Compound Interest="+ci);
}
}