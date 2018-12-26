package service;

import domain.MemberBean;

/**
 * @author Lee Jong-Hyup
 * @date 2018. 12. 26.
 * @dese 멤버기능구현
 * 
 */
public class MemberServiceImpl implements MemberService{
	private MemberBean[] members;
	private int count;
	public MemberServiceImpl(){
	members = new MemberBean[10];
	count = 0;
	}
	@Override
	public void info(String id, String name, String ssn, String pass) {
	MemberBean member = new MemberBean();
	member.setId(id);
	member.setName(name);
	member.setSsn(ssn);
	member.setPass(pass);
	members[count]= member;
	count++;
	}
	@Override
	public MemberBean[] findAll() {
		return members;
	}

	@Override
	public MemberBean[] findByName(String name) {
		
		return null;
	}

	@Override
	public MemberBean findById(String id) {
		MemberBean member = new MemberBean();
		for(int i=0; i<count; i++) {
			if(members[i].getId().equals(id)) {
				member = members[i];
				break;
			}
		}
		return member;
	}

	@Override
	public int countMember() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existMember(String id, String pass) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updatePass(String id, String name, String newPass) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteMember(String id, String pass) {
		// TODO Auto-generated method stub

	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
