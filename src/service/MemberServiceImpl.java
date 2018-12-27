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
	private int count,same;
	public MemberServiceImpl(){
	members = new MemberBean[10];
	count = 0;
	}
	@Override
	public void createMember(String id, String name, String ssn, String pass) {
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
		MemberBean[] members = new MemberBean[same];
		for (int i = 0; i < count; i++) {
			if (members[i].getName().equals(name)) {
				same++;
			}
		}
		System.out.println(same);

		for (int i = 0, j = 0; i < count; i++) {
			if (members[i].getName().equals(name)) {
				members[j] = members[i];
				j++;

		} 
	}
		return members;
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
		return count;
	}

	@Override
	public boolean existMember(String id, String pass) {
		boolean ok = false;
		for(int i=0; i<count; i++) {
			if(members[i].getId().equals(id)&&members[i].getPass().equals(pass)) {
				ok= true;
			}
		}
		return ok;
	}

	@Override
	public void updatePass(String id, String pass, String newPass) {
		for(int i=0; i<count; i++) {
			if(existMember(id,pass)) {
					members[i].setPass(newPass);
					break;
			}
		}
	}

	@Override
	public void deleteMember(String id, String pass) {
		for(int i=0;i<count;i++) { 
			 if(existMember(id,pass)) { 
				members[i] = members[count-1]; 
				members[count-1] = null; 
			 	count--; 
			 	break; 
}
}
}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
