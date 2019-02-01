package client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Employee;

public class CLIENT {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("injections/configure.xml");
		BeanFactory bfactory = new XmlBeanFactory(resource);
		Employee employee = (Employee)bfactory.getBean("employee");
		employee.displayEmployee();
	}

}
