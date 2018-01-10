package in.vamsoft.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext8.xml");
		Employee emp=(Employee)context.getBean("obj");
		emp.display(); 
		
	}

}
