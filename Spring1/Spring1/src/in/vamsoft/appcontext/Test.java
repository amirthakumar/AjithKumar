package in.vamsoft.appcontext;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws IOException {

		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext1.xml");
		Student1 stu=(Student1)context.getBean("obj");
		
		System.out.println("Using Application Context Name is :: " +stu.name);
		
		
		
		
		
		

	}

}
