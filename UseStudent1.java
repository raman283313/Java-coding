import java.io.*;
import java.lang.*;
import java.util.*;
class Student
{
private String nm,fnm;
private int ag;
public Student()
{
nm=fnm="no name";
ag=0;
}
public Student (String x, String y, int z)
{
nm=x;
fnm=y;
ag=z;
}
public void getData()
{
Scanner ob=new Scanner(System.in);
System.out.println("Enter name of Student:->");
nm=ob.nextLine();
System.out.print("Enter father\'s name of student:->");
fnm=ob.nextLine();
System.out.print("Enter age of student:->");
ag=ob.nextInt();
}
public void showData()
{
System.out.print("\nName of student="+nm+"\nFather\'s name of student="+fnm+"\nage of student="+ag);
}
Student sum(Student X)
{
Student temp= new Student();
temp.nm=nm+" "+x.nm;//temp.nm=this.nm+" "+x.nm;
temp.fnm=fnm.concat(" ").concat(x.fnm);
temp.ag=ag+x.ag;//temp.ag=this.ag+x.ag;
return(temp);
}
}
class UseStudent1 
{
public static void main(String args[])
{
Student ob1=new Student("Shivam","abdhesh ",29),ob2=new Student("Kumar","Kr",10),ob3=new Student("Sai","gupta",5);
ob1.showData();
ob2.ShowData();
Student ob4=new Student();
ob4=ob1.sum(ob2);
ob4.showData();
ob3.showData();
}
}
 	