
public class CarConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CarConstructor cl=new CarConstructor("Swift","600000");
cl.displayDetails();

	}
	String brandName,price;
	CarConstructor(String n,String m)
	{
		brandName=n;
		price=m;
	}
		void displayDetails()
		{
			System.out.println("Brand is: "+brandName+"\nprice is:"+price);
	}
}
