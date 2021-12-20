package Day10.Maven2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("NewFile.xml");
    	MessagePass pass=(MessagePass)context.getBean("msgpass");
    	pass.displaymsg();
    	}
    }

