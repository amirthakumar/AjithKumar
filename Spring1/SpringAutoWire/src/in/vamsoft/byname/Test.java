package in.vamsoft.byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		A obj=context.getBean("a1", A.class);
		obj.display();
		
		
		
	}
	
	
}
