package service;

import java.util.ArrayList;

import domain.AccountBean;

/**
 * @author Lee Jong-Hyup
 * @date 2018. 12. 26.
 * @dese 은행 계좌 서비스
 * 
 */
// create
public interface AccountService{ 
	public void createAccount(int money);
	public String createAccountNum(); // 계좌번호생성
	// read
	public ArrayList<AccountBean> findAll();
	public AccountBean findByAccountNum(String accountNum);
	public int	countAccount();
	public boolean	existAccount(String accountNum);
	public String findDate(); // 날짜반환
	//update
	public int depositAccount(int money);
	public int withdrowAccount(int money);
	//delete
	public void deleteMember(String id,String pass);

 
}