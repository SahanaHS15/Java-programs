import java.util.Scanner; 
public class Triangle {
int l,b,h;
Triangle(){
System.out.println("Enter the sides of triangle");
Scanner c=new Scanner(System.in);

l=c.nextInt();
b=c.nextInt();
h=c.nextInt();
int p=l+b+h;
int s2=p/2;
double sq =(s2*(s2-l)*(s2-b)*(s2-h));
double area=Math.sqrt(sq);
System.out.println("Area is: "+area+" Perimeter is: "+p);

}
}