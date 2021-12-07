
public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Constructor c1=new Constructor("20","90000");
System.out.println(c1.getDetails());
	}

	String id,salary;
	Constructor(String x,String sal)
	{
		id=x;
		salary=sal;
	}
	String getDetails()
	{
		return id+" "+salary;
	}
}
