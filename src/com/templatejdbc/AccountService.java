package com.templatejdbc;

import java.util.List;

public class AccountService {
	
	//将dao的实现类注入到service中
	private AccountDaoImple accountDaoImple;
	
	public void setAccountDaoImple(AccountDaoImple accountDaoImple) {
		this.accountDaoImple = accountDaoImple;
	}
	
	//完成增加数据的服务
	public void addAccount(Account account) {
		int num = accountDaoImple.addAccount(account);
		if (num>0) {
			System.out.println("数据插入成功！");
		}else {
			System.out.println("数据插入失败");
		}
	}
	
	//完成删除的服务
	public int deleteAccount(int id) {
		return accountDaoImple.deleteAccount(id);
	}

	//完成修改的服务
	public int updateAccount(int id , String username) {
		return accountDaoImple.updateAccount(id, username);
	}

	//完成按id查询的服务
	public Account queryAccount(int id){
		return accountDaoImple.queryAccount(id);
	}
	
	//完成全部查询的方法的服务
	public List<Account> query(){
		return accountDaoImple.query();
	}
	
	//发工资
	public void fagongzi(String outName, String inName, float gongzi) {
		int i = this.accountDaoImple.fagongzi(outName, inName, gongzi);
		if (i>0) {
			System.out.println(outName+"成功转出"+gongzi+"元钱");
			System.out.println();
			System.out.println(inName+"成功转入"+gongzi+"元钱");
		}
	}
}
