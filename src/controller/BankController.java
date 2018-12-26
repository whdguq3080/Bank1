package controller;
import javax.swing.JOptionPane;

import domain.AccountBean;
import domain.MemberBean;
import service.AccountService;
import service.AccountServiceImpl;
import service.MemberService;
import service.MemberServiceImpl;
public class BankController {
	public void start() {
		MemberBean member = null;
		AccountBean account = null;
		MemberService memberService = new MemberServiceImpl();
		AccountService accountService = new AccountServiceImpl();
		 while(true) {
			 switch (JOptionPane.showInputDialog("0.종료\n"
			 		+ "1.회원가입\n"
			 		+ "2.회원목록\n"
			 		+ "3.아이디찾기\n"
			 		+ "4.로그인확인\n"
			 		+ "5.가입자수\n"
			 		+ "6.아이디 비번 변경\n"
			 		+ "7.회원탈퇴")) {
			case "0":JOptionPane.showMessageDialog(null,"종료합니다");
				     return;
			case "1":String id = JOptionPane.showInputDialog("아이디");
					 String name = JOptionPane.showInputDialog("이름");
					 String ssn = JOptionPane.showInputDialog("주민번호");
					 String pass = JOptionPane.showInputDialog("비밀번호");
					 memberService.info(id,name,ssn,pass);
					 break;
			case"2":JOptionPane.showInputDialog(memberService.findAll());
					 break;
			case"3":id = JOptionPane.showInputDialog("찾을 아이디 입력");
					JOptionPane.showInputDialog(memberService.findById(id));
			 }
		 }
	 }
}
