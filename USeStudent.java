//Example of java
import java.io.*;
import java.lang.*;
import java .util.*;
class Student
{
private String nm,fnm;//data member
private int ag;
public void getData()//Method of class
{
Scanner ob=new Scanner(System.in);
System.out.print("\nEnter name of student:-");
nm=ob.nextLine();
System.out.print("\nEnter father\'s name of student:-");
fnm=ob.nextLine();
System.out.print("\nEnter age of student:-");
ag=ob.nextInt();
}
void showData()//by default it is friendly method
{
System.out.print("\nName of student="+nm);
System.out.print("\nFather's name of student="+fnm);
System.out.print("\nAge of student="+ag);
}
}
class UseStudent
{
public static void main(String args[])
{
Student ob1=new Student(),ob2=new Student(),ob3=new Student();//Object declaration
ob1.getData();
ob2.getData();
ob1.showData();
ob2.showData();
ob3.getData();
ob3.showData();
}
}

