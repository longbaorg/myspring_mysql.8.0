package com.beanlife;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1)
			throws BeansException {
		System.out.println("postProcessAfterInitialization()����");
		
		return arg0;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1)
			throws BeansException {
		System.out.println("postProcessBeforeInitialization()����");
		System.out.println(arg0.toString() + "���󴴽�ʱ�䣺" + new java.util.Date());
		return arg0;
	}

}
