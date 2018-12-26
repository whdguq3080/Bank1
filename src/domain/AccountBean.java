package domain;

public class AccountBean {
	private String accountNum,today;
	private int money;
	//ALT SHIFT S
	public String getAccountNum() {
		return accountNum;
	}
	public String getToday() {
		return today;
	}
	public int getMoney() {
		return money;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public void setToday(String today) {
		this.today = today;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "AccountBean [accountNum=" + accountNum + ", today=" + today + ", money=" + money + "]";
	}
 
	
}

