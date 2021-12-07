
import java.util.Scanner;
public class Inheritance2 {
public static void main(String[] args) {
Result r=new Result();
r.readDetails();
r.readMarks();
r.displayDetails();
r.displayMarks();
r.calculateResults();
r.displayResults();


}



}



class Student2
{
Scanner sc=new Scanner(System.in);
int StudentId;
String StudentName;
String phone;

void readDetails()
{
System.out.println("enter a id:");
StudentId=sc.nextInt();
System.out.println("enter a name:");
StudentName=sc.next();
System.out.println("enter a phone number:");
phone=sc.next();
}
void displayDetails()
{
System.out.println("Details are:\nStudentId: "+StudentId+"\nStudentName: "+StudentName+"\nphone: "+phone);
}
}



class Marks1 extends Student2
{
int m1,m2,m3;

void readMarks()
{
System.out.println("Enter m1 marks");
m1=sc.nextInt();
System.out.println("Enter m2 marks");
m2=sc.nextInt();
System.out.println("Enter m3 marks");
m3=sc.nextInt();
}
void displayMarks()
{
System.out.println("marks are:\nm1: "+m1+"\nm2: "+m2+"\nm3: "+m3);
}
}



class Result extends Marks1
{
int totalMarks;
int percentage;
String grade;

void calculateResults()
{
totalMarks=m1+m2+m3;
percentage=totalMarks/3;
if(totalMarks<=70)
grade="Fail";
else if(totalMarks>70 && totalMarks<=120)
grade="Third Class";
else if(totalMarks>120 && totalMarks<=220)
grade="Second Class";
else
grade="First Class";
}
void displayResults()
{
System.out.println("Results:\nTotal Marks: "+totalMarks+"\nPercentage: "+percentage+"\ngrade: "+grade);
}
}