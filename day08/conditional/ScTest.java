package conditional;

import java.util.Scanner;

public class ScTest {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in); //scanner인스턴스 생성
		// scanner콘솔입력
		
		//1.id와 pw를 입력해서 id가 root이고,pw가 1234이면 로그인 성공!
		//아니면 실패
		System.out.print("id입력");
		String id= sc.nextLine();
		System.out.print("pw입력");
		int pw= sc.nextInt();
		
		if(id.equals("root") && pw==1234)
		{
			System.out.println("로그인 성공");
		}
		else {System.out.println("로그인 실패");}
		
		
		//2.사과 구매 갯수,사과 1개당 가격 입력
		//딸기 구매 갯수, 딸기1 개당 기격입력
		//다음과 같이 출력
		//사과 구매가격은 5500원입니다
		//딸기 구매 가격은 4500원입니다
		//전체 구먀 가격은 10000원입니다.
		System.out.print("사과1개 가격");
		int ap=sc.nextInt();
		
		System.out.print("딸기1개 가격");
		int st=sc.nextInt();
		
		int sum=ap+st;
		
		System.out.println("사과 구매가격은 "+ap+"원 입니다. /"+ "딸기 구매가격은 "+st+"원 입니다. /"+"전체 구매가격은"+sum+" 원입니다");
		
	
		
	
		
		
		sc.close();
	}

}
