import java.io.*;
import java.lang.*;
class MathOperation2
{
public static void main(String args[])
{
int a,b,c;
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
	try
	{
	System.out.print("Enter 1st number:->");
	a=Integer.parseInt(ob.readLine());
	System.out.print("Enter 2nd number:->");
	b=Integer.parseInt(ob.readLine());
	System.out.println(a+" + "+b+" = "+(a+b));
	System.out.println(a+" - "+b+" = "+(a-b));
	System.out.println(a+" x "+b+" = "+a*b);
	System.out.println(a+" / "+b+" = "+a/b);
	}
	catch(IOException exp)
	{
	System.out.print("Input/Output is failure");
	}
	catch(NumberFormatException exp)
	{
	System.out.print("Please put a valid Integral Number.");
	} 	
	catch(ArithmeticException exp)
	{
	System.out.print("Can\'t put 2nd Number is zero.");
	}
	finally
	{
	System.out.print("\n bye bye,End of program");
	}
}
}
	