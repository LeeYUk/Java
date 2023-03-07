package java_DB_Connect;

import java.util.Scanner;

public class MemberShip_Join2 {

	public static void main(String[] args) {
		// 회원가입
		
		//입력
		Scanner sc=new Scanner(System.in);
		
		System.out.println("id,pw,name,tel 순서로 입력: ");
		String id=sc.next();//매개변수에 들어갈 값을 입력받음
		String pw=sc.next();//매개변수에 들어갈 값을 입력받음
		String name=sc.next();//매개변수에 들어갈 값을 입력받음
		String tel=sc.next();//매개변수에 들어갈 값을 입력받음
		
		MemberDAO2 dao2= new MemberDAO2();//dao2메소드 호출 인스턴스 생성
		dao2.insert(id,pw,name,tel);//입력받은 매개변수를 dao2에 전달
		


	}

}
