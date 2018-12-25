package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("aop/beans.xml");
		TestServiceInterface testServiceInterface = (TestServiceInterface) app.getBean("proxyFactoryBean");
		testServiceInterface.sayhellow();
		((TestServiceInterface2)testServiceInterface).saybey();
	}
}
