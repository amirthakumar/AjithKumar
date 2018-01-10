package in.vamsoft.throwadvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext7.xml");
		Validator validator=context.getBean("validator",Validator.class);
		try{
			validator.validate(17);
		}catch (ArithmeticException e) {

			System.err.println(e.getMessage());
		
		}
		
		
	}
	
	
}
