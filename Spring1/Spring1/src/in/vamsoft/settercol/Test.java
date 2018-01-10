package in.vamsoft.settercol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext11.xml");
		Question ques=(Question)context.getBean("obj");
		ques.displayInfo();
		System.out.println(ques);
		
		
		
		
		
	}
	
	
	
}
