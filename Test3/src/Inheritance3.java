import java.util.Scanner;
public class Inheritance3 {



public static void main(String[] args) {
MPCMarks m1=new MPCMarks();
CECMarks c1=new CECMarks();
m1.readDetails();
m1.readMPCMarks();
c1.readCECMarks();
m1.displayDetails();
m1.displayMPCMarks();
c1.displayCECMarks();



}



}



class Student3
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



class MPCMarks extends Student3
{
int mathMark,physicsMark,chemistryMark;

void readMPCMarks()
{
System.out.println("Enter Math Mark");
mathMark=sc.nextInt();
System.out.println("Enter Physics Mark");
physicsMark=sc.nextInt();
System.out.println("Enter Chemistry Mark");
chemistryMark=sc.nextInt();
}
void displayMPCMarks()
{
System.out.println("MPCMarks are:\nMath Mark: "+mathMark+"\nPhysics Mark: "+physicsMark+"\nChemistry Mark: "+chemistryMark);
}
}



class CECMarks extends Student3
{
int CommerceMarks,EconomicMarks,CivilMarks;

void readCECMarks()
{
System.out.println("Enter Commerce Marks marks");
CommerceMarks=sc.nextInt();
System.out.println("Enter Economics Marks marks");
EconomicMarks=sc.nextInt();
System.out.println("Enter Civil Marks marks");
CivilMarks=sc.nextInt();
}
void displayCECMarks()
{
System.out.println("CECMarks are:\nCommerceMarks: "+CommerceMarks+"\nEconomicMarks Mark: "+EconomicMarks+"\nCivilMarks: "+CivilMarks);
}
}