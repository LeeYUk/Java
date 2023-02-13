package arrayReview;

import java.util.Arrays;
import java.util.Random;

public class ArraySort {

	public static void main(String[] args) {
		// 배열 정렬순위
		// 정렬을 할 떄는 Arrays
		Random r = new Random(42);
		int num1[] = new int[10000];
		for (int i = 0; i < num1.length; i++) {
			num1[i] = r.nextInt(1000) + 1; // 1~1000
		}

		// for-each :알아서 위치값을 옮겨주면서 하나씩 꺼내옴 ,출력옹
		for (int x : num1) {
			System.out.println(x);
		}

		// 오름차순()
		Arrays.sort(num1);// sort(num1)==>num1가 바뀌어버림(원본이 파괴)
		// 파괴형 함수

		System.out.println("------------------------------");
		for (int x : num1) {
			System.out.println(x);

			// 정렬후 ,최대값 , 최소값을 출력
			System.out.println("최소값:" + num1[0]);
			System.out.println("최소값:" + num1[num1.length - 1]);
		}

		int sum30 = 0;
		// 상위 30%, 인원3000명, 높은 점수부터 3000개 추출
		for (int i = 7000; i < num1.length; i++) {
			sum30 += num1[i]; // sum30=sum30+i;
		}
		System.out.println("상위 30%평균: " + sum30 / 3000.0);

		
		// 하위 30%의 평균
		int sum0 = 0;
		for (int i = 0; i < 3000; i++) {
			sum0 += num1[i]; // sum30=sum30+i;
		}
		System.out.println("하위 30%평균 : " + (sum0 / 3000.0));
		//String result=Arrays.toString(num1);// 비파괴
	}

}
