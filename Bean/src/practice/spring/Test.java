package practice.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Test {

	 public static void main(String[] args)
	 {
		 BeanFactory factory = new XmlBeanFactory(new FileSystemResource("beans.xml"));
			
			Employee emp1 = factory.getBean("emp1", Employee.class);
			emp1.print();
	 }
}
