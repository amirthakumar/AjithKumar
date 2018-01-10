package in.vamsoft.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountDao dao=(AccountDao)context.getBean("accountsDaoBean");
		dao.createAccount(4, "Ajith", 400000);
		
		
	}
	
	
}
