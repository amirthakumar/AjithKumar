package in.vamsoft.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.vamsoft.dao.EmployeePrepareDao;

public class TestPrepare {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext1.xml");
		EmployeePrepareDao impl=(EmployeePrepareDao)context.getBean("edao");
		Boolean result=impl.saveEmployee(new Employee(2, "Kumar", 200000));
		if(result.equals(true))
		{
			System.out.println("Employee Details Updated Successfully ...!!! ");
			
		}
		else
		{
			System.err.println("Employee Details Not Updated ... ");
		}
		
		
		
		
	}

}
