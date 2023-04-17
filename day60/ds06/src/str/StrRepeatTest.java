package str;

import java.util.Scanner;

public class StrRepeatTest {

	public static void main(String[] args) {
		//수박수박수박수? 문제 https://school.programmers.co.kr/learn/courses/30/lessons/12922
		
		int n=5;
		char as[]= {'수','박'}; //수박이 저장될 배열
		String answer ="";
		
		
		for (int i = 0; i < n; i++) {
			if(i%2==0) {
				answer+=as[0];
			}
			else if(i%2==1) {
				answer +=as[1];
			}
		}
		
		System.out.println(answer);
	}

}
