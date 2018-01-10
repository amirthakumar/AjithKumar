package in.vamsoft.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext4.xml");
		
		Question ques=(Question)context.getBean("obj");
		
		ques.displayInfo();
		
	}
}
