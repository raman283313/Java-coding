//WAP to accept 2 number display all Math operations?
import java.io.*;
class MathOperation1
{
public static void main(String args[])
{
double num1,num2,sum,sub,multi,div;
DataInputStream ob=new DataInputStream(System.in);
try
{
System.out.print("Enter 1st number:->");
num1=Double.parseDouble(ob.readLine());
System.out.print("Enter 2nd number:->");
num2=Double.parseDouble(ob.readLine());
sum=num1+num2;
sub=num1-num2;
multi=num1*num2;
div=num1/num2;
System.out.println(num1+" + "+num2+"="+sum);
System.out.println(num1+" - "+num2+"="+sub);
System.out.println(num1+" x "+num2+"="+multi);
System.out.println(num1+" / "+num2+"="+div);
}
catch(IOException obj)
{
}
}
}