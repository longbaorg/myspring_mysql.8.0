package com.templatejdbc;

import java.util.List;

public class AccountService {
	
	//��dao��ʵ����ע�뵽service��
	private AccountDaoImple accountDaoImple;
	
	public void setAccountDaoImple(AccountDaoImple accountDaoImple) {
		this.accountDaoImple = accountDaoImple;
	}
	
	//����������ݵķ���
	public void addAccount(Account account) {
		int num = accountDaoImple.addAccount(account);
		if (num>0) {
			System.out.println("���ݲ���ɹ���");
		}else {
			System.out.println("���ݲ���ʧ��");
		}
	}
	
	//���ɾ���ķ���
	public int deleteAccount(int id) {
		return accountDaoImple.deleteAccount(id);
	}

	//����޸ĵķ���
	public int updateAccount(int id , String username) {
		return accountDaoImple.updateAccount(id, username);
	}

	//��ɰ�id��ѯ�ķ���
	public Account queryAccount(int id){
		return accountDaoImple.queryAccount(id);
	}
	
	//���ȫ����ѯ�ķ����ķ���
	public List<Account> query(){
		return accountDaoImple.query();
	}
	
	//������
	public void fagongzi(String outName, String inName, float gongzi) {
		int i = this.accountDaoImple.fagongzi(outName, inName, gongzi);
		if (i>0) {
			System.out.println(outName+"�ɹ�ת��"+gongzi+"ԪǮ");
			System.out.println();
			System.out.println(inName+"�ɹ�ת��"+gongzi+"ԪǮ");
		}
	}
}
