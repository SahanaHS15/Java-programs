import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map5 {

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);

HashMap<Integer,Employee> map= new HashMap<>();
System.out.println("enter number ");
int n=sc.nextInt();
for(int i=0;i<n;i++){
System.out.println(" enter the name,id,salary of employee");

String name = sc.next();

int id = sc.nextInt();
int salary = sc.nextInt();

Employee e=new Employee(name,id,salary);
map.put(i,e);


}
for(Map.Entry<Integer, Employee> me: map.entrySet()) {
System.out.println(me.getKey()+" and "+me.getValue());
}
}

}
class Employee{
String name; int id,salary;
public Employee(String name,int id,int salary) {
super();
this.name=name;
this.id=id;
this.salary=salary;

}
public String toString()
{
return "name:"+name+" id:"+id+" salary:"+salary;

}
}