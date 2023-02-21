package casting;

import java.util.ArrayList;

public class CastingTest {

	public static void main(String[] args) {
		// 형변환 확인 문제
		
		ArrayList list= new ArrayList();
		
		list.add(1000);
		list.add(189.1);
		list.add(false);
		list.add('남');
		
		//1. 전체 목록을 출력
		System.out.println("전체목록을 프린트");
		System.out.println(list);
		
		//2.돈 1000을 꺼내서 2000을 더해 출력
		//int sum=(Integer)list.get(0)+2000;
		System.out.println((int)list.get(0)+2000);
		
		//3 키 189.1을 꺼내서 10을 더해 출력
		System.out.println((Double)list.get(1)+10);
		
		//4 아침여부 false을 꺼내서 아침을 먹었으면 배불러요 아니면 배고파요
		System.out.println("아침을 먹었나요?");
		if(list.get(2).equals(false))
		{
			System.out.println("배고파요");
		}
		else 
		{
			System.out.println("배불러요");
		}
		
		//5 성별이 '남'을 꺼내서 '남'이면 주민번호는 1,3 아니면 주민번호 2,4
		if(list.get(3).equals('남')) {
			System.out.println("남자: 주민번호는 1,3 이에요");
		}
		else {
			System.out.println("여자: 주민번호는 2,4 이에요");
		}
		//6. 2~3에서 형변환(업캐스팅,다운캐스틩),오토박싱,오토언박싱을 순서대로 작성해주세요
		//2번 ArrayList에 저장된 0번 인덱스를 int로 언박싱하여 타입변현을 시키고  2000을 더해줌
		//Object <-업캐스팅 -Integer <-오토박싱 -int
		//3번 ArrayList에 저장된 1번 인덱스를 double로 언박싱하여 타입변환을 시키고 20을 더해줌
	}

}
