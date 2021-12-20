package SpringMaven.mavenspring;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
* Hello world!
*
*/
public class App
{
public static void main( String[] args )
{
ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
EmployeeOperations op=(EmployeeOperations)context.getBean("operationdemo");

Employee e1=new Employee();
e1.setName("sahana");
e1.setEmail("xyz");
e1.setId("10");
e1.setSalary("30000");

int result=op.insert(e1);
System.out.println(result);
}
}