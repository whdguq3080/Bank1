/**
 * 
 */
package service;

import java.util.ArrayList;

import domain.AdminBean;

/**
 * @author Lee Jong-Hyup
 * @date 2018. 12. 27.
 * @dese
 * 
 */
public interface AdminService {
	//Create
	public void createAdmin(String adminNum,String pass,String auth);
	//READ
	public ArrayList<AdminBean> list();
	public ArrayList<AdminBean> findByAuth(String auth);
	public AdminBean findById(String adminNum);
	public int countAdmin();
	public boolean existAdmin(String adminNum,String pass);
	//UPDATE
	public void updatePass(String adminNum, String pass,String newPass);
	public void updateAuth(String adminNum, String auth, String newAuth);
	//DELETE
	public void deleteAdmin(String adminNum);
}

