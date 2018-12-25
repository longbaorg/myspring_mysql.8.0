package com.constructor;

public class Employee {
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//¹¹Ôì×¢Èë
	public Employee(int i,String name) {
		// TODO Auto-generated constructor stub
		this.id=i;
		this.name=name;
		System.out.println("Employee.Employee()");
	}
}
