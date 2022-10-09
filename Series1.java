//Q. 1+2+4+8.....n terms.
import java.io.*;
import java.util.*;
import java.lang.*;
class Series1
{
public static void main(String args[])
{
long num ,a, tot,d;
Scanner ob= new Scanner(System.in);
System.out.print("Enter number of term of series 1+2+4+8+.....:->");
num= ob.nextLong();
tot=0;
d=1;
       for(a=1;a<=num;a++)
	{
	System.out.print(d+"+");
	tot+=d;
	d*=2;
	}
System.out.print("\b="+tot);
}
}
