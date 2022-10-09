import java.io.*;
import java.lang.*;
class ExampleOfString
{
public static void main(String args[])
{
String str0=new String("pk");
String str1="Raman";
String str2=new String("Ram");
StringBuffer ob=new StringBuffer("raja");
String str3=new String(ob);
char []arr={'r','a','m','n','a','r','a','y','a','n',' ','s','i','n','g','h','\0'};
String str4=new String(arr);
char nm[]={'r','a','m','n','a','r','a','y','a','n',' ','s','i','n','g','h','\0'};
String str5=new String(nm,3,7);
System.out.println("str0=" +str0+ "\nstr1=" +str1+ "\nstr2=" +str2+ "\nstr3=" +str3);
System.out.print("str4=" +str4+ "\nstr5=" +str5+ "\nob=" +ob+ "\nname=" +nm[0]+nm[1]+nm[2]);
}
}