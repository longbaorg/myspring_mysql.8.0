package com.templatejdbc;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class AccountDaoImple implements AccountDao {
	
	//声明这个对象属性和set方法
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public int addAccount(Account account) {
		// TODO Auto-generated method stub
		String sql="insert into abc value(?,?);";
		Object obj[]=new Object[]{
			account.getId(),
			account.getUsername()
		};
		int num = jdbcTemplate.update(sql, obj);
		return num;
	}

	@Override
	public int updateAccount(int id, String username) {
		// TODO Auto-generated method stub
		String sql="update abc set username=? where id=?";
		Object obj[] = new Object[]{username,id};
		int num= jdbcTemplate.update(sql, obj);
		return num;
	}

	@Override
	public int deleteAccount(int id) {
		// TODO Auto-generated method stub
		String sql="delete from abc where id=?";
		int num = jdbcTemplate.update(sql, id);
		return num ;
	}

	@Override
	public Account queryAccount(int id) {
		// TODO Auto-generated method stub
		String sql="select * from abc where id=?";
		//一行数据转成哪儿一种类型的对象，参数需要提供具体的类型
		RowMapper<Account> rowMapper = new BeanPropertyRowMapper<Account>(Account.class);
		Account num= jdbcTemplate.queryForObject(sql, rowMapper, id);	
		return num;
	}

	@Override
	public List<Account> query() {
		// TODO Auto-generated method stub
		String sql="select * from abc";
		RowMapper<Account> rowMapper = new BeanPropertyRowMapper<Account>(Account.class);
		List<Account> accountslist = jdbcTemplate.query(sql , rowMapper);
		return accountslist;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT,readOnly=true)
	public int fagongzi(String outName, String inName, float gongzi) {
		// TODO Auto-generated method stub
		this.jdbcTemplate.update("update abc set gongzi=gongzi+? where username=?",gongzi , inName);
//		int ii = 1/0;
		int i = this.jdbcTemplate.update("update abc set gongzi=gongzi-? where username=?",gongzi , outName);
		return i;
	}


	
}
