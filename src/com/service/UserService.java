package com.service;

public class UserService {
	private String name;	//״̬����˽�л�
	
	public UserService() {
		System.out.println("UserService���췽��ִ��");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//�������
	public void sayHello() {
		System.out.println("hello" + name);
	}
}
