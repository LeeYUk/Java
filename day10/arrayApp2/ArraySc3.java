package arrayApp2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ArraySc3 {

	public static void main(String[] args) {

		// 배열 응용3
		// 여러개의 배열을 사용하고 싶은경우
		// 같은 인덱스를 사용

		String[] famliy = { "아버지", "어머니", "형", "나" };
		int age[] = { 100, 50, 30, 25 };
		double height[] = { 175.5, 150.5, 180.5, 165.5 };
		
		System.out.println("우리집 식구 정리");
		System.out.println("---------------------------");
		System.out.println("이름         나이           키");
		
		for (int i = 0; i < height.length; i++) {
			System.out.println(famliy[i]+"\t" + age[i]+"\t"+height[i]);
		}

	}

}
