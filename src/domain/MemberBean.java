package domain;

/**
 * @author Lee Jong-Hyup
 * @date 2018. 12. 26.
 * @dese 은행계좌 빈객체
 * 
 */
public class MemberBean {
	private String id,name,ssn,pass;
		
	public void setId(String id) {
		this.id = id;
	}	
	public String getId() {
		return id;
	}	
	public void setName(String name) {
		this.name= name;
	}	
	public String getName() {
		return id;
	}	
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}	
	public String getSsn() {
		return ssn;
	}	
	public void setPass(String pass) {
		this.pass = pass;
	}	
	public String getPass() {
		return pass;
	}	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("1.아이디%s\n"
				+ "2.이름%s\n"
				+ "3.주민번호%s\n"
				+ "4.비밀번호%s",id,name,ssn,pass);
	}
	}
