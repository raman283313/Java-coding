/*Q.1+2/2^2+3/3^3+4/4^4......1/n^n=?*/
import java.io.*;
import java.lang.*;
import java.util.*;
class Series3
{
public static void main(String args[])
{
long num,a,d;
double tot;
Scanner ob=new Scanner(System.in);
System.out.print("Enter number of term of series 1+2/2^2+3/3^3+4/4^4......:->");
num=ob.nextLong();
tot=1;
System.out.print("1+");	
	for(a=2;a<=num;a++)
	{
	System.out.print(a+"/"+a+"^"+a+"+");
	d=(long)Math.pow(a,a);
	tot+=(double)a/d;
	}
System.out.print("\b="+tot);
}
}