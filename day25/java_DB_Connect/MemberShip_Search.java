package java_DB_Connect;

import java.util.Scanner;

import javax.swing.JOptionPane;

import screen_DB_Connect.MemberVO;

public class MemberShip_Search {

	public static void main(String[] args) {
		// 회원 검색
		
		//입력
		Scanner sc=new Scanner(System.in);
		
		System.out.println("id 입력: ");
		String id=sc.next();//매개변수에 들어갈 값을 입력받음
		
		
		MemberDAO3 dao2= new MemberDAO3();//dao2 메소드 호출 인스턴스 생성
		MemberVO bag=dao2.one(id);//입력받은 매개변수를 dao2에 전달
		
		String total= bag.getId() +", "+bag.getPw() +", "+bag.getName() +", "+bag.getTel();
		JOptionPane.showMessageDialog(null, total);


	}

}
