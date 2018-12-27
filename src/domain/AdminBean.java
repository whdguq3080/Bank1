/**
 * 
 */
package domain;

/**
 * @author Lee Jong-Hyup
 * @date 2018. 12. 27.
 * @dese
 * 
 */
public class AdminBean {
	private String adminNum,name,pass,auth;

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAdminNum() {
		return adminNum;
	}


	public String getPass() {
		return pass;
	}


	public String getAuth() {
		return auth;
	}


	public void setAdminNum(String adminNum) {
		this.adminNum = adminNum;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public void setAuth(String auth) {
		this.auth = auth;
	}


	@Override
	public String toString() {
		return "관리자\n"
				+ " [관리자번호=" + adminNum 
				+ "\n 이름=" + name 
				+ "\n 비밀번호=" + pass 
				+ "\n 권한=" + auth + "]";
	}
	
	
	
}
