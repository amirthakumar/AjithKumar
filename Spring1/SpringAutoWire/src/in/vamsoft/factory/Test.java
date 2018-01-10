package in.vamsoft.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext3.xml");
		A a=(A)context.getBean("a",A.class);
		a.display();
		
		
		
	}
	
	
}
