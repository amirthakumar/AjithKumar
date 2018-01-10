package in.vamsoft.dependentobj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext3.xml");
		
		Employee emp=(Employee)context.getBean("obj1");
		
		emp.show();
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
