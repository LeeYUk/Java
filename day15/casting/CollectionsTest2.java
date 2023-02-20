package casting;

import java.util.ArrayList;

public class CollectionsTest2 {

	public static void main(String[] args) {
		// 형변환 컬렉션 테스트
		//스키대화 시상자 목록 출력
	
		
		ArrayList list=new ArrayList();
		list.add("박스키");
		list.add("송스키");
		list.add("김스키");
		list.add("정스키");
		
		list.remove(1);
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i+ 1)+"등: "+list.get(i));
		}
		
		System.out.println(list.contains("김연아"));
		System.out.println(list.size());
		
		ArrayList list2=new ArrayList();
		list2.add("이스키");
		list2.add("박스키");
		list2.add("양스키");
		list2.addAll(list2);//list가 늘어났으므로 파괴
		System.out.println(list);
		
		System.out.println(list2.isEmpty());
		list2.clear();
		System.out.println(list2);
		
		
		
	}

}
