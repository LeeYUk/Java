package java_DB_Connect;

import java.util.Scanner;

public class Bbs2_Delete {

	public static void main(String[] args) {
		// 회원가입
		
		//입력
		Scanner sc=new Scanner(System.in);
		
		System.out.println("no 입력: ");
		int no =sc.nextInt();//매개변수에 들어갈 값을 입력받음
		
		
		Bbs2DAO dao2= new Bbs2DAO();//dao2 메소드 호출 인스턴스 생성
		dao2.delete(no);//입력받은 매개변수를 dao2에 전달
		


	}

}
