import java.io.*;
import java.util.*;
import datatypepackage.*;
class UseDataTypePackage
{
public static void main(String args[])
{
byte a;
short b;
int c;
long d;
char e;
float f;
double g;
String h;
System.out.print("Enter a byte data:->");
a=AcceptAnyDataMember.getByte();
System.out.print("Enter a short integral number:->");
b=AcceptAnyDataMember.getShort();
System.out.print("Enter an Intrgral number->");
c=AcceptAnyDataMember.getInt();
System.out.print("Enter a long number:->");
d=AcceptAnyDataMember.getLong();
System.out.print("Enter a Charecter:->");
e=AcceptAnyDataMember.getChar();
System.out.print("Enter a Floating point number:->");
f=AcceptAnyDataMember.getFloat();
System.out.print("Enter a double floating point number:->");
g=AcceptAnyDataMember.getDouble();
System.out.print("Enter a string:->");
h=AcceptAnyDataMember.getString();
System.out.print("a="+a+"\nb="+b+"\nc="+c+"\nd="+d+"\ne="+e+"\nf="+f+"\ng="+g+"\nh="+h);
}
}
