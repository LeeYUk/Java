package review;

import java.util.Stack;

public class Array2 {

	public static void main(String[] args) {
		// 배열만들기
	//좋아하는 여행지 5개 임의데이터 넣고 출력
		//좋아하는 색깔5개 임의데이터 넣고 출력
		//좋아하는 연예인 5의 키 임의데이터 넣고 출력
		String tra[]= {"서울","도쿄","창원","홋카이도","하노이"};
		char ch[]= {'R','B','G','P','Y'};
		double hei[]= {175.4, 185, 178.9 , 153.4 ,169.5};
		
		for (String t : tra) {
			System.out.println(t);
		}
		System.out.println("----------------");
		for (char c: ch) {
			System.out.println(c);
		}
		System.out.println("----------------");
		for (double h : hei) {
			System.out.println(h);
		}
		
		

	}
}
