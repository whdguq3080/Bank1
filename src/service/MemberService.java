package service;

import domain.MemberBean;

public interface MemberService {
	/**
	 * CREATE
	 */
	public void info(String id,String name,String ssn,String pass);
	/**
	 * READ
	 */
	public MemberBean[] findAll();
	public MemberBean[] findByName(String id);
	public MemberBean findById(String id);
	public int	countMember();
	public boolean	existMember(String id,String pass);
	public void updatePass(String id,String name,String newPass);
	public void deleteMember(String id,String pass);
	;
	/**
	 * UPDATE
	 */
	/**
	 * DELETE
	 */
	
}
