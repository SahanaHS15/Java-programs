import java.util.Scanner;

public class AreaReturn {

	public static void main(String[] args) {
		AreaReturn a=new AreaReturn();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choic:\n1:Circle\n2:Rectangle\n3:Square");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
		{
			System.out.println("Enter the radius of Circle");
			int r=sc.nextInt();
			double areaCircle=a.circle(r);
			System.out.println("area of the circle is:"+areaCircle);
		}
		break;
		case 2:
		{
			System.out.println("Enter the length and breath of Rectangle");
			int l=sc.nextInt();
			int b=sc.nextInt();
int areaRectangle=a.rectangle(l,b);
			System.out.println("area of the Rectangle is:"+areaRectangle);
		}
		break;
		case 3:
		{
			System.out.println("Enter the length of Square");
			int l=sc.nextInt();

int areaSquare=a.square(l);
			System.out.println("area of the Square is:"+areaSquare);
		}
		break;
		default:System.out.println("Invalid option");
		}
	}
	double circle(int r)
	{
		double areaC=3.14*r*r;
		return areaC;
		}
	int rectangle(int l,int b)
	{
		int areaR=l*b;
		return areaR;
	}
	int square(int l)
	{
		int areaS=l*l;
		return areaS;
	}
	
	}


