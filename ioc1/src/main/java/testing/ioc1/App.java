package testing.ioc1;

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
    	ApplicationContext context =   
    		    new ClassPathXmlApplicationContext("applicationContext.xml");  
        System.out.println("Welcome");	
        Car c=context.getBean("Car",Car.class);
        c.speed();
        c.price();
    }
}

