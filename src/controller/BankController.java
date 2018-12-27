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
			 		+ "3.이름찾기\n"
			 		+ "4.아이디찾기\n"
			 		+ "5.가입자수\n"
			 		+ "6.로그인확인\n"
			 		+ "7.아이디 비번 변경\n"
			 		+ "8.회원탈퇴\n"
			 		+ "9.계좌생성\n"
			 		+ "10.계좌번호 생성\n"
			 		+ "11.계좌 목록")) {
			case "0":JOptionPane.showMessageDialog(null,"종료합니다");
				     return;
			case "1":String id = JOptionPane.showInputDialog("아이디");
					 String name = JOptionPane.showInputDialog("이름");
					 String ssn = JOptionPane.showInputDialog("주민번호");
					 String pass = JOptionPane.showInputDialog("비밀번호");
					 memberService.createMember(id,name,ssn,pass);
					 break;
			case "2":JOptionPane.showInputDialog(memberService.findAll());
					 break;
			case "3":JOptionPane.showMessageDialog(null,memberService.findByName(JOptionPane.showInputDialog("이름을 검색하시오")));
					 break;
			case "4":id = JOptionPane.showInputDialog("찾을 아이디 입력");
					JOptionPane.showInputDialog(memberService.findById(id));
			case "5":JOptionPane.showMessageDialog(null,"가입자 수 :"+memberService.countMember());
					break;
			case "6":
					if (memberService.existMember(JOptionPane.showInputDialog("로그인 하실 ID"),
						JOptionPane.showInputDialog("PASS"))) {
					JOptionPane.showMessageDialog(null, "로그인 성공");
					} else {
					JOptionPane.showMessageDialog(null, "로그인 실패");
					}
					break;
			case "7":memberService.updatePass(JOptionPane.showInputDialog("아이디 입력"),
					 JOptionPane.showInputDialog("비밀번호 입력"),
					 JOptionPane.showInputDialog("바꿀 비밀번호 입력"));
					 break;
			case "8":memberService.deleteMember(JOptionPane.showInputDialog("아이디 입력"),
												JOptionPane.showInputDialog("비밀번호 입력"));
					 break;
			case "9":
					 break;
			case "10":accountService.createAccountNum();
					  break;
			case "11":JOptionPane.showInputDialog(accountService.findAll()); 
			 
			 }
		 }
	 }
}
