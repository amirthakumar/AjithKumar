package in.vamsoft.workout;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext9.xml");
		Employee emp=(Employee)context.getBean("emp");
		Employee emp1=(Employee)context.getBean("emp1");
		
		System.out.println(emp);
		System.out.println(emp1);
		
	}
}
