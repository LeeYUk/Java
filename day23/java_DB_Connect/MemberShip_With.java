package java_DB_Connect;

import java.util.Scanner;

public class MemberShip_With {

	public static void main(String[] args) {
		// 회원가입
		
		//입력
		Scanner sc=new Scanner(System.in);
		
		System.out.println("id 입력: ");
		String id=sc.next();//매개변수에 들어갈 값을 입력받음
		
		
		MemberDAO2 dao2= new MemberDAO2();//dao2 메소드 호출 인스턴스 생성
		dao2.delete(id);//입력받은 매개변수를 dao2에 전달
		


	}

}
