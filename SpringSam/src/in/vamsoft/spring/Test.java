package in.vamsoft.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
		Resource res=new ClassPathResource("ApplicationContext.xml");
		BeanFactory bean=new XmlBeanFactory(res);
		Student s=(Student)bean.getBean("studentbean");
		s.displayInfo();
		
	}

}
