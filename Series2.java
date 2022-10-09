/*Q.1+1/2+1/3+1/4......1/n=?*/
import java.io.*;
import java.lang.*;
import java.util.*;
class Series2
{
public static void main(String args[])
{
long num,a;
double tot;
Scanner ob=new Scanner(System.in);
System.out.print("Enter number of term of series 1+1/2+1/3.....:->");
num=ob.nextLong();
tot=0;
	for(a=1;a<=num;a++)
	{
	System.out.print("1/"+a+"+");
	tot+=(double)1/a;
	}
System.out.print("\b="+tot);
}
}