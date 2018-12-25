package com.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.collection.Classes;
import com.collection.Student;
import com.service.ByeService;
import com.service.UserService;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//第一种方式：通过ApplicationContext的形式获取Bean对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Classes classes = (Classes)ac.getBean("classes");
		for(String classess : classes.getStudentname()){
			System.out.println(classess);
		}
		//问题：当执行完上面这句话，是不是在ApplicationContext容器中已经存在userService对象？
		//说明：当我们实例化ApplicationContext.xml时，该文件中配置的bean被实例化（只有满足某个要求的bean被实例化了）
//		UserService us = (UserService)ac.getBean("userService");
		//UserService us0 = (UserService)ac.getBean("userService");
		//说明：只有当你使用getBean方法获取某个bean对象时，才会实时的创建UserService对象
		//UserService us1 = (UserService)ac.getBean("userService");
		
		
		//System.out.println("us0 = " + us0);
		//System.out.println("us1 = " + us1);
		
		//第二种方式：通过bean工厂的形式获取bean对象
//		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/test/beans.xml"));
//		//问题：当执行完上面这句话，是不是在BeanFactory容器中已经存在userService对象？
//		//说明：如果我们使用BeanFactory去获取bean对象时，当你只是实例化工厂容器，那么容器中的bean不会被实例化
//		UserService us0 = (UserService)factory.getBean("userService");
//		//说明：只有当你使用getBean方法获取某个bean对象时，才会实时的创建UserService对象
//		UserService us1 = (UserService)factory.getBean("userService");
//		
//		
//		System.out.println("us0 = " + us0);
//		System.out.println("us1 = " + us1);
		
		
//		ApplicationContext ac = new FileSystemXmlApplicationContext("C:\\Users\\Administrator\\Desktop\\myspring\\src\\com\\test\\beans.xml");
//		UserService us0 = (UserService)ac.getBean("userService");
//		us0.sayHello();
		
	}

}
