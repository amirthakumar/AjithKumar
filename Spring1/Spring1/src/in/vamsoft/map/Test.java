package in.vamsoft.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	
	
	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext6.xml");
		Question ques=(Question)context.getBean("obj");
		ques.displayInfo();
		
		
		
		
		
	}
}
