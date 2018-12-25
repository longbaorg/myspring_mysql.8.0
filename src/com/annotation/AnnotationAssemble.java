package com.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationAssemble {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/annotation/beans.xml");
		UserController userController = (UserController) applicationContext.getBean("userController");
		userController.save();
	}
}
