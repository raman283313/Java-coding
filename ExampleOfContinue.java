//Example of continue statement.Q.WAP to print A to Z and a to z with ASCII code
import java.io.*;
import java.lang.*;
class ExampleOfContinue
{
public static void main(String args[])
{
System.out.print("A to Z and a to z with it's ASCII code as follows:->");
for(int a=65;a<=122;a++)
{
	if(a>90&&a<97)
	continue;
System.out.print((char)a+"="+a+",");
}
System.out.print("\b.");
}
}