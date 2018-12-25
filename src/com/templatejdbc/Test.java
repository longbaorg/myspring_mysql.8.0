package com.templatejdbc;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


public class Test {
	
	//���ڲ��Գ���Ĳ�����
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/templatejdbc/beans.xml");
		
		/*
		 * �����������ݿ��д�����
		
		JdbcTemplate jdbcTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");
		String sql="create table abc( "
				+ "id int not null primary key,"
				+ "username varchar(10) not null"
				+ ");";
		jdbcTemplate.execute(sql);
		System.out.println("����abc���ݱ�ɹ�");
		 */
		
		
		/*
		 * �������ڶ�abc������ݲ���Ĳ���de����
		 
		AccountService accountService = (AccountService) applicationContext.getBean("accountService");
		Account account = new Account();
		account.setId(6);
		account.setUsername("����");
		accountService.addAccount(account);
		*/
		
		/*
		 * �������ڶ�abc������ݲ�ѯ(���ո�����id)�Ĳ���de����
		 
		AccountService accountService = (AccountService) applicationContext.getBean("accountService");
		Account ac = accountService.queryAccount(3);
		System.out.println("id��"+ac.getId()+"           name��"+ac.getUsername());
		*/
		
		/*
		 * �������ڶ�abc������ݲ�ѯ(��������)�Ĳ���de����
		 
		AccountService accountService = (AccountService) applicationContext.getBean("accountService");
		List<Account> list = accountService.query();
		for (Account account : list) {
			System.out.println("id��"+account.getId()+"           name��"+account.getUsername()
					+"           ������"+account.getGongzi());
		}
		*/
		
		/*
		 * �������ڶ�abc��������޸ĵĲ���de����
		 
		AccountService accountService = (AccountService) applicationContext.getBean("accountService");
		int num = accountService.updateAccount(4, "�ϻ�");
		if (num>0) {
			System.out.println("�޸ĳɹ�");
		}else {
			System.out.println("�޸�ʧ��");
		}
		System.out.println(num);
		*/
		
		
		/*
		 * �������ڶ�abc�������ɾ���Ĳ���de����
		
		AccountService accountService = (AccountService) applicationContext.getBean("accountService");
		int num = accountService.deleteAccount(2);
		if (num>0) {
			System.out.println("ɾ���ɹ�");
		}else {
			System.out.println("ɾ��ʧ��");
		}
		 */
		
		AccountService accountService = (AccountService) applicationContext.getBean("accountService");
		accountService.fagongzi("����", "������", 100);
		
		System.out.println("�ܹ����б�");
		List<Account> list = accountService.query();
		for (Account account : list) {
			System.out.println("id��"+account.getId()+"           name��"+account.getUsername()
					+"           ������"+account.getGongzi());
		}
	}
}
