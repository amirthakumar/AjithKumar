package in.vamsoft.workoutsetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext10.xml");
		Employee emp=(Employee)context.getBean("obj");
		System.out.println(emp);
		
	}
	
	
}
