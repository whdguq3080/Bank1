package index;

import controller.BankController;
import domain.MemberBean;
import service.MemberService;
import service.MemberServiceImpl;

public class Index {
	public static void main(String[] args) {
		new BankController().start();
	}
}
