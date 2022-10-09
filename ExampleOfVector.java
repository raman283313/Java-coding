import java.io.*;
import java.util.*;
import java.lang.*;
class ExampleOfVector
{
public static void main(String args[])
{
String str1="Adesh chauhan ",str2="Sushant gupta";
Integer ob1=new Integer(33);
Double ob2=new Double(44.3);
Vector obj=new Vector();
obj.addElement(str1);
obj.addElement(ob2);
obj.addElement(ob1);
int a=obj.size();
System.out.println("Total number of object="+a);
int i;
for(i=0;i<obj.size();i++)
System.out.println((i+1)+".value of vector object="+obj.elementAt(i));
obj.insertElementAt(str2,1);
a=obj.size();
System.out.println("After inserting,total number of object="+a);
for(i=0;i<obj.size();i++)
System.out.println((i+1)+".value of vector object="+obj.elementAt(i));
obj.removeElement(ob2);
a=obj.size();
System.out.println("After removing(object wise),total number of object="+a);
for(i=0;i<obj.size();i++)
System.out.println((i+1)+".value of vector object="+obj.elementAt(i));
obj.removeElementAt(1);
a=obj.size();
System.out.println("After removing(index wise),total number of object="+a);
for(i=0;i<obj.size();i++)
System.out.println((i+1)+".value of vector object="+obj.elementAt(i));
obj.removeAllElements();
a=obj.size();
System.out.println("After removing all object,total number of object="+a);
}
}
