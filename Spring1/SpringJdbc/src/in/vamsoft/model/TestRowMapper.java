package in.vamsoft.model;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.vamsoft.daoimpl.EmployeeRowMapperImpl;

public class TestRowMapper {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
		EmployeeRowMapperImpl emp = (EmployeeRowMapperImpl) context.getBean("edao");
		List<Employee> list = emp.getAllEmployeesRowMapper();
		for (Employee emp1 : list) {

			System.out.println(emp1);

		}
	}

}
