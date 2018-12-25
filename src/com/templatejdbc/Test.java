package com.templatejdbc;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


public class Test {
	
	//用于测试程序的测试类
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/templatejdbc/beans.xml");
		
		/*
		 * 这用于在数据库中创建表
		
		JdbcTemplate jdbcTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");
		String sql="create table abc( "
				+ "id int not null primary key,"
				+ "username varchar(10) not null"
				+ ");";
		jdbcTemplate.execute(sql);
		System.out.println("创建abc数据表成功");
		 */
		
		
		/*
		 * 这里用于对abc表的数据插入的操作de服务
		 
		AccountService accountService = (AccountService) applicationContext.getBean("accountService");
		Account account = new Account();
		account.setId(6);
		account.setUsername("刘凯");
		accountService.addAccount(account);
		*/
		
		/*
		 * 这里用于对abc表的数据查询(按照给定的id)的操作de服务
		 
		AccountService accountService = (AccountService) applicationContext.getBean("accountService");
		Account ac = accountService.queryAccount(3);
		System.out.println("id是"+ac.getId()+"           name是"+ac.getUsername());
		*/
		
		/*
		 * 这里用于对abc表的数据查询(所有数据)的操作de服务
		 
		AccountService accountService = (AccountService) applicationContext.getBean("accountService");
		List<Account> list = accountService.query();
		for (Account account : list) {
			System.out.println("id是"+account.getId()+"           name是"+account.getUsername()
					+"           工资是"+account.getGongzi());
		}
		*/
		
		/*
		 * 这里用于对abc表的数据修改的操作de服务
		 
		AccountService accountService = (AccountService) applicationContext.getBean("accountService");
		int num = accountService.updateAccount(4, "孟虎");
		if (num>0) {
			System.out.println("修改成功");
		}else {
			System.out.println("修改失败");
		}
		System.out.println(num);
		*/
		
		
		/*
		 * 这里用于对abc表的数据删除的操作de服务
		
		AccountService accountService = (AccountService) applicationContext.getBean("accountService");
		int num = accountService.deleteAccount(2);
		if (num>0) {
			System.out.println("删除成功");
		}else {
			System.out.println("删除失败");
		}
		 */
		
		AccountService accountService = (AccountService) applicationContext.getBean("accountService");
		accountService.fagongzi("代磊", "许龙豹", 100);
		
		System.out.println("总工资列表");
		List<Account> list = accountService.query();
		for (Account account : list) {
			System.out.println("id是"+account.getId()+"           name是"+account.getUsername()
					+"           工资是"+account.getGongzi());
		}
	}
}
