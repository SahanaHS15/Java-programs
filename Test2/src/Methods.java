import java.util.Scanner;
public class Methods {
float pi=3.14f;
Scanner sc=new Scanner(System.in);
void factorial(int num) {
	int fact=1;
	for(int i=1;i<=num;i++) {
		fact=fact*i;
}
System.out.println("factorial is "+fact);
}

void sum(float a1,float a2) {
	System.out.println("sum is "+(a1+a2));
}


void area(char c) {
	if(c=='c' || c=='C') {
		System.out.println("enter the radius");
int r=sc.nextInt();
System.out.println("area of circle is "+(pi*r*r));

	}
	else if(c=='r' || c=='R') {
		System.out.println("enter the width and height");
int w=sc.nextInt();
int h=sc.nextInt();
System.out.println("area of rectangle is "+(w*h));
	}
	else {
		System.out.println("enter the size");
				int s=sc.nextInt();
				System.out.println("area of square is"+(s*s));
	}

	}
public static void main (String[]args) {
	
	Methods m=new Methods();
	Scanner sc=new Scanner(System.in);
	
	m.factorial(5);
	m.sum(34.5f,664.76f);
	System.out.println("\nFind radius press \n c to circle \n r for rectangle \n s for square");
char rc=sc.next().charAt(0);
m.area(rc);

}
}

