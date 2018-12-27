package service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import domain.AccountBean;

/**
 * @author Lee Jong-Hyup
 * @date 2018. 12. 26.
 * @dese 은행계좌 구현객체
 * 
 */
public class AccountServiceImpl implements AccountService{
	private ArrayList<AccountBean> list;
	
	public AccountServiceImpl() {
		list = new ArrayList<>();
	}
/****************************
 * 	Create
 ***************************/
	@Override
	public void createAccount(int money) {
		AccountBean account = new AccountBean();
		account.setAccountNum(createAccountNum());
		account.setMoney(money);
		account.setToday(findDate());
		list.add(account);
	}
	public String createAccountNum() {
		String accountNum = "";
		Random random = new Random();
		accountNum = random.nextInt(9999)+1 +"-"+random.nextInt(9999) ;
		return accountNum;
		
	}
	/****************************
	 * 	Read
	 ***************************/
	@Override
	public ArrayList<AccountBean> findAll() {
	
		return list;
	}
	@Override
	public AccountBean findByAccountNum(String accountNum) {
		AccountBean accountBean = new AccountBean();
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getAccountNum().equals(accountNum)) {
				
			}
		}
		return accountBean;
	}
	@Override
	public int countAccount() {
	
		return list.size();
	}

	@Override
	public String findDate() {
	String today = "";
	Date date = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	today = sdf.format(date);
	return today;
	}
	
	@Override 
	public void depositMoney(String accountNum,int money) { 
		for(int i=0;i<list.size();i++) { 
		 	if(list.get(i).getAccountNum().equals(accountNum)) { 
		 		int restMoney = list.get(i).getMoney(); 
		 			restMoney+=money; 
					list.get(i).setMoney(restMoney); 
				} 
		 	} 
	}

	@Override
	public void withdrowMoney(String accountNum,int money) {
		for(int i=0;i<list.size();i++) { 
		 	if(list.get(i).getAccountNum().equals(accountNum)) { 
		 		int restMoney = list.get(i).getMoney(); 
		 			restMoney-=money; 
					list.get(i).setMoney(restMoney); 
				} 
		 	} 
	}

	@Override
	public void deleteAccountNum(String accountNum) {
		for(int i=0;i<list.size();i++) { 
			 if(list.get(i).getAccountNum().equals(accountNum)) { 
				list.remove(i); 
		 } 
	}
}
}