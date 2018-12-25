package com.collection;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/collection/beans.xml");
		
		Department dep = (Department) ac.getBean("department");
		Classes cla = (Classes) ac.getBean("cla");
		System.out.println("******ȡ�������е�ֵ*******");
		String[] empNames = dep.getEmpName();
		for(int i = 0; i < empNames.length; i++) {
			System.out.println(empNames[i]);
		}
		System.out.println("****foreachȡ�������е�ֵ******");
		for(String empName : dep.getEmpName()) {
			System.out.println(empName);
		}
		System.out.println("****foreachȡ�������е�ֵ******");
		ArrayList<String> listNames = dep.getEmpNameList();
		for(String listname : listNames) {
			System.out.println(listname);
		}
		System.out.println("****foreachȡ������������Ա����ֵ******");
		ArrayList<Employee> listEmps = dep.getEmpList();
		for(Employee e : listEmps) {
			System.out.println(e.getId() + "   " + e.getName());
		}
		System.out.println("****foreachȡ���༶����������Ա����ֵ******");
		ArrayList<Student> studentlites = cla.getStudentlites();
		String sdString= cla.getName();
		for(Student e : studentlites) {
			System.out.println(e.getId() + "   " + e.getName());
			
		}
		System.out.println(sdString);
		
		System.out.println("****hashset����******");
		HashSet<Employee> employeesset = dep.getEmplisthashset();
		for (Employee employee : employeesset) {
			System.out.println(employee.getId()+ ""+employee.getName());
		}
		 
		System.out.println("****hashMap����******");   
		HashMap<Integer, Employee>employeemap = dep.getEmphashMap();
		for (java.util.Map.Entry<Integer, Employee> entert : employeemap.entrySet()) {
			System.out.println(entert.getKey()+""+entert.getValue().getName()+""+entert.getValue().getId());
		}
		
		
		System.out.println("****hashsetѧ��******");
		HashSet<Student> stuloyeesset = cla.getStulisthashset();
		for (Student student : stuloyeesset) {
			System.out.println(student.getId()+ ""+student.getName());
		}
		
		System.out.println("****hashMapѧ��******");
		HashMap<Integer, Student>stuloyeemap = cla.getStuhashMap();
		for(java.util.Map.Entry<Integer, Student> stumap : stuloyeemap.entrySet()){
			System.out.println(stumap.getKey()+""+stumap.getValue().getName()+""+stumap.getValue().getId());
		}
		
	}

}
