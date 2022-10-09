//WAP to reverse of given String?(using StringBuffer class)
import java.io.*;
import java.lang.*;
import java.util.*;
class ReverseString1
{
public static void main(String args[])
{
Scanner ob=new Scanner(System.in);
StringBuffer str1;
System.out.print("Enter a String:->");
str1=new StringBuffer(ob.nextLine());
System.out.print("Revese of " +str1+ " = " +str1.reverse());
}
}