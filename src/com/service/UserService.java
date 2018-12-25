package com.service;

public class UserService {
	private String name;	//状态数据私有化
	
	public UserService() {
		System.out.println("UserService构造方法执行");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//具体服务
	public void sayHello() {
		System.out.println("hello" + name);
	}
}
