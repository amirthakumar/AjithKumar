package in.vamsoft.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.vamsoft.daoimpl.EmployeeImpl;
import in.vamsoft.pojo.Employee;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeImpl impl = (EmployeeImpl) context.getBean("emp");

		Employee emp = new Employee();
		emp.setId(3);
		emp.setName("Ajk");
		emp.setSalary(3000000);

		impl.saveEmployee(emp);
		System.out.println("Successfully Inserted");

	}

}
