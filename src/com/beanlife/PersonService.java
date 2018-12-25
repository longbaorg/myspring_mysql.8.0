package com.beanlife;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class PersonService implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean{
		private String name;
		private String objName;
		
		public PersonService() {
			System.out.println("PersonService()���췽��");
		}

		
		public PersonService(String name) {
			System.out.println("PersonService()���������췽��");
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			System.out.println("setName(String name)����");
			this.name = name;
		}
		
		public String getObjName() {
			return objName;
		}

		public void sayHi() {
			System.out.println("hi" + name);
		}
		
		@Override
		public String toString() {
			return this.objName;
		}

		@Override
		public void setBeanName(String arg0) {
			System.out.println("setBeanName()������ȡbean�����֣�id���Ե�ȡֵ����" + arg0);
			this.objName = arg0;
		}


		@Override
		public void setBeanFactory(BeanFactory arg0) throws BeansException {
			System.out.println("setBeanFactory()����" + arg0);			
		}


		@Override
		public void setApplicationContext(ApplicationContext arg0)
				throws BeansException {
			System.out.println("setApplicationContext()����" + arg0);
			
		}


		@Override
		public void afterPropertiesSet() throws Exception {
			System.out.println("afterPropertiesSet()");
			
		}
		
		public void myinit() {
			System.out.println("myinit()����");
		}

		/*
		@Override
		public void destroy() throws Exception {
			System.out.println("destroy()");
		}
		*/
		public void mydestroy() {
			System.out.println("destroy()");
		}
}
