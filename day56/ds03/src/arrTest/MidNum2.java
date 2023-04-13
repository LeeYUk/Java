package arrTest;

import java.util.Arrays;

public class MidNum2 {

	public static void main(String[] args) {
		// 중앙값 구하기2
		
		int[] s = { 5, 2, 1, 9, 11, 15, 17 };
		// 배열에 들어간 하나의 값:element,엘리먼트
		// 홀수개 
		String s2 = Arrays.toString(s);
		System.out.println(s2);
		
		//1. 정렬을 먼저 하자
		Arrays.sort(s); //파괴! 
		System.out.println(Arrays.toString(s));
		
		//2. 중앙위치를 구하자 
		int center1 = s.length / 2;
		int center2 = s.length / 2-1;
		
		//3. 배열의 중앙위치값을 get!
		int answer = s[center1]+s[center2];
		
		System.out.println(answer);
		
	}

}
