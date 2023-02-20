package casting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionsTest3 {

	public static void main(String[] args) {
		// 형변환 컬렉션 테스트
		//콜렉션 확인문제
	
		System.out.println("1================");
		// 1. 한번 갔던 여행지는 가지않으려고 합니다. 가고싶은 여행지 5곳을 콜렉션으로 만들어서 전체 출력
		HashSet trv=new HashSet(); //중복된 값을 출력하고 싶지 않을때 Hashset사용 
		//값은 렌덤으로 배치출력됨
		trv.add("도쿄");
		trv.add("서울");
		trv.add("뉴욕");
		trv.add("창원");
		trv.add("대구");
		trv.add("도쿄");// 중복된 값을 걸렀는지 확인하기 위해 중복된값 입력
		System.out.println("여행지 춢력 : "+trv);
		
		//2. 각 방에 물건 배치입니다. 안방에는 Tv, 거실에는 쇼파 부엌에는 냉장고 ,현관에는 신발의 정보를 콜렉션으로 만들어서
		//1)전체 출력 ,2)현관에는 무엇이있는지 출력, 거실에 책상으로 변경하여 전체 출력
		System.out.println("2================");
		HashMap home=new HashMap();
		home.put("안방","TV");
		home.put("거실","쇼파");
		home.put("부엌","냉장고");
		home.put("현관","신발");
		System.out.println("전체 출력 : "+home);//전체 출력
		System.out.println("부엌에는 무엇이 있나요? : "+home.get("부엌"));//부엌에는 무엇이 있나요?
		home.replace("거실", "책상");// 거실가구를 책상으로 변경 
		System.out.println("전체 출력 : "+home);//전체 출력
		
		System.out.println("3================");
		//3. 오늘 내가 할일 우선순위 5개 목록을 만들어서 출력
		//1)전체 출력
		//2)첫번째 할 일과 마지막 할 일 출력
		//3)2번째 할 일을 "청소"로 변경하여 출력 
		
		ArrayList list=new ArrayList();
		list.add("공부");
		list.add("자기");
		list.add("먹기");
		list.add("놀기");
		list.add("눕기");
		
		System.out.println("전체 출력");
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i+1)+"번째 "+list.get(i));
		}
		
		System.out.println("  ");
		System.out.println("첫번째 값과 마지막 값 출력");
		System.out.println(list.get(0));
		System.out.println(list.get(4));
		System.out.println(" ");
		
		System.out.println("전체 출력");
		list.set(1, "청소");
		System.out.println(list);
		
		
	}

}
