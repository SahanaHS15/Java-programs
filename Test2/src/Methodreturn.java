
public class Methodreturn {

	
	String oe(int num) {
		if(num%2==0) {
			return num+" number is even";
	}
	else {
		return num+" number is odd";
	}
	}
	String pn(int n) {
		if(n>=0) {
			return n+" number is positive";

		}
		else {
			return n+" number is negative";

		}
	}
	float radius(float r) {
		return 3.142f*r*r;
	}
	int radius(int s) {
		return s*s;
	}
	
	int radius(int w,int h) {
		return w*h;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Methodreturn m=new Methodreturn();
System.out.println(m.oe(24));
System.out.println(m.pn(-22));
float rr=m.radius(23);
System.out.println("radius of circle is "+rr);
int rs=m.radius(25);
System.out.println("radius of square is "+rs);
int rd=m.radius(25,30);
System.out.println("radius of rectangle is "+rd);
	
	}

}
