



import java.util.Scanner;



public class CustomException3 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter a String");
String str=sc.next();
int len=str.length();
try {
if(len<=10)
throw new Marks("String length is "+len+" Password length not match Exception");
System.out.println("String length is "+len+" Password matches "+str);
}
catch(Marks m)
{
System.out.println(m);
}
}
}
class Password extends Exception{
public Password(String message) {
super(message);
}
}