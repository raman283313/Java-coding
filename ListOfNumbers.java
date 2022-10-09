import java.io.*;
import java.lang.*;
class ListOfNumbers
{
public static void main(String args[])
{
double list[],tot;
int i,num=0;
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
	try
	{
	System.out.print("Enter how  many numbers you put into the list:-");
	num=Integer.parseInt(ob.readLine());
	list=new double[num];
		for(i=0;i<num;i++)
		{
		System.out.print("Enter"+(i+1)+"number:->");
		list[i]=Double.parseDouble(ob.readLine());
		}
	System.out.println("Sum of all list of number are:->");
	tot=0;
		for(i=0;i<num;i++)
		{
		System.out.print(list[i]+"+");
		tot+=list[i];
		}
	System.out.print("\b="+tot);
	}
	
	catch(IOException exp)
	{
	System.out.print("\nInput/output is Failure.");
	}
	
	catch(NumberFormatException exp)
	{
	System.out.print("\nPlease put only a numerical data within range");
	}
	catch(ArrayIndexOutOfBoundsException exp)
	{
	System.out.print("\nyou are trying to access invalid index position");
	System.out.print("\nYou put only "+num+" number into the list.");
	}
	finally
	{
	System.out.print("\n\nEnd of program.");
	}
}
}
