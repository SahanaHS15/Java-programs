package demoOfMaven.mavendemo2;

import org.springframework.stereotype.Component;

@Component
public class Salary {

	public Salary()
	{
	System.out.println("Constructor Salary Address--");
	}
	void calculateSalary(int x)
	{
	int total=x*12;
	float y=total/100000f;
	System.out.println("Annual Salary is: "+y+"LPA");

	}

}
