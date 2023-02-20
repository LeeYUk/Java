package casting;

import java.util.ArrayList;

public class CollectionsTest {

	public static void main(String[] args) {
		// 형변환 컬렉션 테스트
		//많은 양의 데이터를 다루는 컬렉션(Collection)
		// ==>종류가 많다
		// ==>많은 양의 데이터들도 특징이 있고, 그 특징에 따라
		// 컬렉션의 종류가 많음.
		// ==> 배열 + 사이즈 조절 +타입 아무거나 넣을수 있는 ArrayList
		
		ArrayList list=new ArrayList();
		list.add("홍길동");
		list.add(100);
		list.add(11.2);
		list.add(true);
		System.out.println(list);
		//toString()으로 재정의 되어있어서 가르키는 값이 
		System.out.println(list.get(1));
		//중간에 데이터 삽입 가능
		list.add(0,"김길동");
		System.out.println(list);
		//데이터 제거
		list.remove(0);
		System.out.println(list);
		//파괴함수 : 원본을 파괴시키는함수(원본이 변형, ram에 있는 데이터 변경)
		//비파괴함수 : 원본을 파괴되지않는 함수(ram에 있는 데이터 불변)
		
		System.out.println(list);//변경
		
		list.set(0,"정길동"); //파괴함수
		System.out.println(list);
		
		int index=list.indexOf(true);// 데이터 찾기
		System.out.println(index);//인덱스 위치 찾기
		
		boolean result =list.contains(list);//포함여부 확인 
		System.out.println(result);
	}

}
