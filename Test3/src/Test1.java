
import java.util.Scanner;
class Student {
int studentid;
String studentname;
String phone;
Scanner s= new Scanner(System.in);
public void ReadDetails()
{System.out.println("enter the student id, name and phone number:");
int studentid = s.nextInt();
String studentname = s.next();
String phone =s.next();
this.studentid= studentid;
this.studentname=studentname;
this.phone= phone;}public void displayDetails()
{
System.out.println(" id:"+studentid +" \n name: "+ studentname +" \n phone:" +phone);
}
}public class Test1 extends Student
{
int m1;
int m2;
int m3;
Scanner s= new Scanner(System.in);
public void ReadMarks()
{System.out.println("enter the marks m1, m2, m3:");
int m1 = s.nextInt();
int m2 = s.nextInt();
int m3 = s.nextInt();this.m1= m1;
this.m2=m2;
this.m3=m3;}public void display()
{
System.out.println(" marks 1:"+m1 +" \n mark 2:"+ m2 +"\n marks 3: " +m3);
}public static void main(String[] args) {
Test1 m= new Test1();
m.ReadDetails();
m.displayDetails();
m.ReadMarks();
m.display();
}}

