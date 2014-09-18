package raza.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");
		HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
		helloWorld.setMessage("Today is Tuesday");
		helloWorld.getMessage();
	}

}
