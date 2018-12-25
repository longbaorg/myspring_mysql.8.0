package com.templatejdbc;

import java.util.List;

public interface AccountDao {
	public int addAccount(Account account);
	public int updateAccount(int id , String username);
	public int deleteAccount(int id);
	public Account queryAccount(int id);
	public List<Account> query();
	public int fagongzi(String name1,String name2 , float gongzi);
}
