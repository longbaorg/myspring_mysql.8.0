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
		//��һ�ַ�ʽ��ͨ��ApplicationContext����ʽ��ȡBean����
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Classes classes = (Classes)ac.getBean("classes");
		for(String classess : classes.getStudentname()){
			System.out.println(classess);
		}
		//���⣺��ִ����������仰���ǲ�����ApplicationContext�������Ѿ�����userService����
		//˵����������ʵ����ApplicationContext.xmlʱ�����ļ������õ�bean��ʵ������ֻ������ĳ��Ҫ���bean��ʵ�����ˣ�
//		UserService us = (UserService)ac.getBean("userService");
		//UserService us0 = (UserService)ac.getBean("userService");
		//˵����ֻ�е���ʹ��getBean������ȡĳ��bean����ʱ���Ż�ʵʱ�Ĵ���UserService����
		//UserService us1 = (UserService)ac.getBean("userService");
		
		
		//System.out.println("us0 = " + us0);
		//System.out.println("us1 = " + us1);
		
		//�ڶ��ַ�ʽ��ͨ��bean��������ʽ��ȡbean����
//		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/test/beans.xml"));
//		//���⣺��ִ����������仰���ǲ�����BeanFactory�������Ѿ�����userService����
//		//˵�����������ʹ��BeanFactoryȥ��ȡbean����ʱ������ֻ��ʵ����������������ô�����е�bean���ᱻʵ����
//		UserService us0 = (UserService)factory.getBean("userService");
//		//˵����ֻ�е���ʹ��getBean������ȡĳ��bean����ʱ���Ż�ʵʱ�Ĵ���UserService����
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
