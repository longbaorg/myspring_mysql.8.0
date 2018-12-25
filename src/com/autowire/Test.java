package com.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/autowire/beans.xml");
		Master master = (Master) applicationContext.getBean("mas");
//		System.out.println(master.getDog());
		System.out.println(master.getMasname()+"yang"+master.getDog().getNamedog());
	}
}
