package com.annotation;

import org.springframework.stereotype.Repository;

@Repository("UserDao")
public class UserDaoImpl implements UserDao {

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("UserDao........save");
	}

}
