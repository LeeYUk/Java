package casting;

import java.util.HashMap;

public class DicTest {

	public static void main(String[] args) {
		//사전문제
		
		HashMap map=new HashMap();
		//map.put(키,값)
		map.put("사과","apple");
		map.put("메론","melon");
		map.put("물","water");
		System.out.println(map);
		System.out.println(map.get("사과"));// get(키)
		
		map.remove("물");//삭제
		System.out.println(map);
		
		map.replace("메론", "melons");//데이터 바꾸기
		System.out.println(map);
		
		
	}

}
