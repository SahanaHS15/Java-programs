
import java.util.*;
public class CustomException {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter marks");
int n=sc.nextInt();
try {
if(n<200)
throw new Marks("Failed Exception");
System.out.println("Marks is "+n);
}
catch(Marks m)
{
System.out.println(m);
}
}
}
class Marks extends Exception{
public Marks(String message) {
super(message);
}
}