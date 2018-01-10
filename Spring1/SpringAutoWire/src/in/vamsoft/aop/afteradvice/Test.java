package in.vamsoft.aop.afteradvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext5.xml");
		A a=context.getBean("proxy",A.class);
		a.m();
		
		
	}
	
	
}
