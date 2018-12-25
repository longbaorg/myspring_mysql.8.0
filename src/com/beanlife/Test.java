package com.beanlife;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/beanlife/beans.xml");
		PersonService ps = (PersonService)ac.getBean("personService");
		ps.sayHi();

	}

}
