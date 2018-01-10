package in.vamsoft.nonstring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext5.xml");
		Question ques=(Question)context.getBean("ques");
		ques.displayInfo();
		
		
		
		
	}
	
}
