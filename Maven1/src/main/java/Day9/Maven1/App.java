package Day9.Maven1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("Demo.xml");
    	Employee e=(Employee)context.getBean("s3");
    	e.displayEmp();
    	Student s=(Student)context.getBean("s1");
    	s.displayStu();
    	Books b=(Books)context.getBean("s2");
    	b.displaybooks();
    	}
    
    }

