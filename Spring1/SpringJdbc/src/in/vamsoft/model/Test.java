package in.vamsoft.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.vamsoft.daoimpl.EmployeeImpl;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeImpl impl=(EmployeeImpl)context.getBean("edao");
		int rowsInserted=impl.saveEmployee(new Employee(1,"Ajith",100000));
		
		System.out.println("Total Inserted Rows : " +rowsInserted);
		
		
		
	}
	
	
}
