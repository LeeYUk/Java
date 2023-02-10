package review;

import java.util.Stack;

public class Array1 {

	public static void main(String[] args) {
		// 배열만들기
		
		//for(;;)형식은 c언어에서 파생됨
		//최근 반복문은  for-each문을 선호함
		
		//1. 배열 만들기-이미 값을 알고 있는 경우
		//2. 배열 만들기-값을 모르고 있는 경우, 공간부터 만들어두자
		
		String[] hobby= {"잠","먹기","산책","달리기"};//1.
		//hobby:참조형변수, 주소가 들어가있음
		System.out.println(hobby);
		System.out.println("0 : "+hobby[0]);
		System.out.println("1 : "+hobby[1]);
		System.out.println(hobby.length);
		System.out.println(hobby[3]);
		System.out.println("---------------------------");
		for (int i = 0; i < hobby.length; i++) {
			//==>i는 index의 역할 
			System.out.println(i+" :" +hobby[i]);
		}
		System.out.println("---------------------------");
		//for-each문:알아서 처음부터 인텍스를 하나씩 증가하면서 하나씩 꺼내온다
		//{"잠","먹기","산책","달리기"}
		//자바에서 for-each문은 출력용
		for (String x : hobby) {
			System.out.println(x);
		}
		System.out.println("---------------------------");
		String[] jobs=new String[5];//2
		System.out.println(jobs);
		jobs[0]="백엔드 프로그래머";
		jobs[1]="카페주인";
		System.out.println(jobs[0]);
		System.out.println(jobs[1]);
		System.out.println(jobs[4]);
		System.out.println("---------------------------");
		for (int i = 0; i < jobs.length; i++) {
			System.out.println(i+" : "+jobs[i]);
		}
		System.out.println("---------------------------");
		for (String x : jobs) {
			System.out.println(x);
		}
		
		
		
		
	}

}
