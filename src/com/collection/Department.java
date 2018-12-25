package com.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Department {
	//简单属性
	private String name;
	//数组
	private String[] empName;
	//集合-字符串
	private ArrayList<String> empNameList;
	//集合-对象
	private ArrayList<Employee> empList;
	//集合-hashset
	private HashSet<Employee> emplisthashset;
	//集合-hashmap
	private HashMap<Integer, Employee> emphashMap;
	
	
	
	public HashSet<Employee> getEmplisthashset() {
		return emplisthashset;
	}

	public void setEmplisthashset(HashSet<Employee> emplisthashset) {
		this.emplisthashset = emplisthashset;
	}

	public HashMap<Integer, Employee> getEmphashMap() {
		return emphashMap;
	}

	public void setEmphashMap(HashMap<Integer, Employee> emphashMap) {
		this.emphashMap = emphashMap;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getEmpName() {
		return empName;
	}

	public void setEmpName(String[] empName) {
		this.empName = empName;
	}

	public ArrayList<String> getEmpNameList() {
		return empNameList;
	}

	public void setEmpNameList(ArrayList<String> empNameList) {
		this.empNameList = empNameList;
	}

	public ArrayList<Employee> getEmpList() {
		return empList;
	}

	public void setEmpList(ArrayList<Employee> empList) {
		this.empList = empList;
	}

}
