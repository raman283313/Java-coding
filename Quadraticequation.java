//Q1.WAP to find out the root of quadratric equation.
import java.io.*;
import java.lang.*;
import java.util.*;
class QuadraticEquation
{
public static void main(String args[])
{
Scanner ob=new Scanner(System.in);
double a,b,c,d;
System.out.print("enter cofficient of x square,cofficient of x and constant term of quadratic equation:->");
a=ob.nextDouble();
b=ob.nextDouble();
c=ob.nextDouble();
d=(b*b)-(4*a*c);
if(a==0)
System.out.print("Quadratic equation is not possible.");
else if(d>0)
{
double alpha,beta;
alpha=(-b+Math.sqrt(d))/2*a;
beta=(-b-Math.sqrt(d))/2*a;
System.out.print(alpha+" and "+beta+"are the root of quadratic Equation");
}
else if(d==0)
{
double alpha=-b/2*a;
System.out.print("Both root of quadratic Equation are same, that="+alpha);
}
else
System.out.print("the root of quadratic equation is imagnory");
}
}