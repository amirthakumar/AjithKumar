package in.vamsoft.employee;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
		
		Resource res=new ClassPathResource("app.xml");
		BeanFactory bean=new XmlBeanFactory(res);
		Employee emp1=(Employee)bean.getBean("emp");
		System.out.println(emp1.toString());
		
		
	}

}
