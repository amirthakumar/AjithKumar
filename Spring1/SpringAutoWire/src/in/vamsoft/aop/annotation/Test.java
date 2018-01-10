package in.vamsoft.aop.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext8.xml");
		Operation oper=context.getBean("oper",Operation.class);
		System.out.println("Calling Msg");
		oper.msg();
		System.out.println("Calling m...");
		oper.m();
		System.out.println("calling k...");
		oper.k();
		
		
		
	}
	
}
