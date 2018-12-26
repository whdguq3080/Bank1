package service;

import domain.MemberBean;

/**
 * @author Lee Jong-Hyup
 * @date 2018. 12. 26.
 * @dese 은행 계좌 서비스
 * 
 */
public interface AccountService{ 

	public void createAccount(int money);
	public void findAll();
	public void findByAccountNum(String accountNum);
	public int	countAccount();
	public boolean	existAccount(String accountNum);
	public int depositAccount(int money);
	public int withdrowAccount(int money);
	public void updatePass(String id,String name,String newPass);
	public void deleteMember(String id,String pass);

 
}