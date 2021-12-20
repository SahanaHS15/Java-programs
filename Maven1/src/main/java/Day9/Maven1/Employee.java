package Day9.Maven1;

public class Employee {

	
	String name,address;
	int id,salary;
	public String getName() {
	return name;
	} public void setName(String name) {
	this.name = name;
	} public String getAddress() {
	return address;
	} public void setAddress(String address) {
	this.address = address;
	} public int getId() {
	return id;
	} public void setId(int id) {
	this.id = id;
	} public int getSalary() {
	return salary;
	} public void setSalary(int salary) {
	this.salary = salary;
	}
	void displayEmp() {
	System.out.println("Name: "+name);
	System.out.println("address: "+address);
	System.out.println("id: "+id);
	System. out.println("salary "+salary);



	}

}
