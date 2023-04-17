package str;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StrDescendingSort {

	public static void main(String[] args) {
		// 문자열 내림차순 배치
		String s="Zbcdefg";
		String answer="";
		
		//1.for문을 이용해서 뒤에서부터 charAt()으로 하니씩 꺼내온다
		//문자들을 1개씩 떨어뜨려야함 ==>ArrayList, 배열
		String s2[]=s.split("");
		List<String> list=Arrays.asList(s2);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		//1-2. for문을 이용해서 하나씩 꺼낸 후,
		//2. answer에 붙인다
		for (String x : list) {
			answer += x;
		}
		
		System.out.println(answer);

	}

}
