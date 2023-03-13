package java_DB_Connect;

import java.util.Scanner;

public class Connect_Test {

	public static void main(String[] args) {
		// 연결 테스트
		
				//입력
				Scanner sc=new Scanner(System.in);
				
				System.out.println("id,과목명,시험날짜,수험번호 순서로 입력: ");
				
				Exam_ApplicationVO bag=new Exam_ApplicationVO();
				
				
				String id=sc.next();//매개변수에 들어갈 값을 입력받음
				String cert_name=sc.next();//매개변수에 들어갈 값을 입력받음
				String cert_day=sc.next();//매개변수에 들어갈 값을 입력받음
				String cert_num=sc.next();//매개변수에 들어갈 값을 입력받음
				
				bag.setId(id);
				bag.setCert_name(cert_name);
				bag.setCert_day(cert_day);
				bag.setCert_num(cert_num);
				
				Exam_ApplicationDAO dao= new Exam_ApplicationDAO();//dao2메소드 호출 인스턴스 생성
				//dao.(id,cert_name,cert_day,cert_num);//입력받은 매개변수를 dao2에 전달
				dao.insert(bag);
	}

}
