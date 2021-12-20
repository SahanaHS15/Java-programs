package demoOfMaven.mavendemo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("NewFile2.xml");
//    	Student pass=(Student)context.getBean("MyMsg");
//    	pass.displayStu();

    	Student Spass=(Student)context.getBean("MsgStu");
    	Spass.displayStu();
    	
//    	Employee Epass=(Employee)context.getBean("MsgEmp");
//    	Epass.displaySal();
    	}
    	}
    	
    	
   

