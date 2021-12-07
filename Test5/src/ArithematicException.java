
public class ArithematicException
{
void division(int a,int b)
{
int c=a/b;
System.out.println("Division of a number is successful");
System.out.println("Output of division: "+c);
}
public static void main(String[] args)
{
ArithematicException ex=new ArithematicException();
ex.division(10,5);
}
}