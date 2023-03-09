package screen_DB_Connect;

import javax.swing.JOptionPane;

import java_DB_Connect.MemberDAO3;

public class StartUi {

	public static void main(String[] args) {
		// 로그인 화면
		
		String id=JOptionPane.showInputDialog("id");
		String pw=JOptionPane.showInputDialog("pw");
		
		
		MemberDAO3 dao=new MemberDAO3();
		MemberVO bag=new MemberVO();
		
		bag.setId(id);
		bag.setPw(pw);
		
		int result =dao.login(bag);
		
		if(result==0) {
			System.out.println("로그인 실패");
		}
		else {
			System.out.println("로그인 성공");
			//Bbs2Ui.open();
		}

	}

}
