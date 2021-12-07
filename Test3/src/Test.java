 
public class Test {

    public static void main(String aa[])
    {
             B b=new B();
        b.display();
        b.show();
        b.details();
}    
}
 
class A   //Parent class or Super class
{
 
void display()
{
System.out.print("PARENT DISPLAY ");
}
 
void show()
{
    System.out.print("PARENT SHOW METHOD ");
}
}
 
class B   extends A    //child or subclass
{
void details()
{
    System.out.print("B Details METHOD ");
}
 
}