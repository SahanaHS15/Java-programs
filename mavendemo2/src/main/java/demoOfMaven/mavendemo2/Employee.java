package demoOfMaven.mavendemo2;
import java.util.Scanner;



import org.springframework.beans.factory.annotation.Autowired;
public class Employee {
	Scanner sc=new Scanner(System.in);

	Salary sal;



	public Salary getSal() {
	return sal;
	}



	@Autowired
	public void setSal(Salary sal) {
	this.sal = sal;
	}

	void displaySal()
	{
	System.out.println("enter the salary per month:");
	int n=sc.nextInt();
	sal.calculateSalary(n);
	}




	}


