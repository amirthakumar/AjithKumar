package in.vamsoft.model;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.vamsoft.daoimpl.EmployeeResultSetImpl;

public class TestResult {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext2.xml");
		EmployeeResultSetImpl impl=(EmployeeResultSetImpl)context.getBean("edao");
		List<Employee> list=impl.showEmployee();
		
		for(Employee list1:list)
		{
			System.out.println(list1);
		}
		
		
		
	}
	
	
}
