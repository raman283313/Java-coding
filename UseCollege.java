//Example of constracture
//WAP to create a class college have data member for college name,principle name,Stablished year and area;
import java.io.*;
import java.lang.*;
class College
{
private String clgnm,prnm;
private int yr;
private double ar;
public College()//default/no argument constructer
{
clgnm="no name";
prnm="no name";
yr=0;
ar=0.0;
}
public College(String x,String y,int z,double p)//parameterized/argumented constructer
{
this.clgnm=x;
prnm=y;
yr=z;
ar=p;
}
public void get()throws Exception
{
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
System.out.print("\nEnter name of college:-");
this.clgnm=ob.readLine();
System.out.print("enter principle name of college:-");
prnm=ob.readLine();
System.out.print("Enter Established year of college:-");
yr=Integer.parseInt(ob.readLine());
System.out.print("\nEnter area of college:-");
ar=Double.parseDouble(ob.readLine());
}
public void show()
{
System.out.print("\nName of college="+clgnm+"\nPrinciple name of college="+prnm);
System.ou.print("Established year of college="+yr+"\nArea of college="+ar);
}
class UseCollege
{
public static void main(String args[])throws Exception
{
College obj=new College("MLT","rajiv sinha",1972,3838.33);
College obj2,obj3;
obj2=new College("RJM","Renu singh",1989,4567.8);
obj3=new College();
obj1.show();
obj2.show();
obj3.show();
}
}