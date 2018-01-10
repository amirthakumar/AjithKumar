package in.vamsoft;

import java.io.IOException;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) throws IOException {

		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		System.out.println("after bf");
		Student stu = (Student) factory.getBean("obj");
		System.out.println("Name of the Student is : " + stu.name);
		System.out.println("Age : " + stu.getAge());

	}

}
