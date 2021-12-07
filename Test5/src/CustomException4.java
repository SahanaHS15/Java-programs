



import java.util.Scanner;



public class CustomException4 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int n=sc.nextInt();
try {
if(n%2!=0)
throw new Marks(n+" is NotEven Exception");
System.out.println("Number is Even "+n);
}
catch(Marks m)
{
System.out.println(m);
}
}
}
class NotEven extends Exception{
public NotEven(String message) {
super(message);
}



}