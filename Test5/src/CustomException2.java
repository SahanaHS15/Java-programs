



import java.util.Scanner;



public class CustomException2 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int n=sc.nextInt();
try {
if(n<0)
throw new Marks("Negative number Exception");
System.out.println("Number is Positive"+n);
}
catch(Marks m)
{
System.out.println(m);
}
}
}
class NegativeNumber extends Exception{
public NegativeNumber(String message) {
super(message);
}
}