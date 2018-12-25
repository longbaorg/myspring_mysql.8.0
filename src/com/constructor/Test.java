package com.constructor;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/constructor/beans.xml");
		Employee employee = (Employee) ac.getBean("emp1");
		System.out.println(employee.getId()+""+employee.getName());
	}

}
