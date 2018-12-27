package service;

import domain.MemberBean;

public interface MemberService {
	/**
	 * CREATE
	 */
	public void createMember(String id,String name,String ssn,String pass);
	/**
	 * READ
	 */
	public MemberBean[] findAll();
	public MemberBean[] findByName(String name);
	public MemberBean findById(String id);
	public int	countMember();
	public boolean	existMember(String id,String pass);
	;
	/**
	 * UPDATE
	 */
	public void updatePass(String id,String pass,String newPass);
	/**
	 * DELETE
	 */
	public void deleteMember(String id,String pass);
	
}
