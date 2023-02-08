package review;

import javax.swing.JOptionPane;

public class sequential {

	public static void main(String[] args) {
		// 입력 --> 처리 -->출력
		//두 개의 숫자를 입력을 받아서 처리해서 출력
		//프로그래밍은 손으로 치는 값은 모두다 스트링으로 취금(문자열)
		
		//입력
		String str1=JOptionPane.showInputDialog("입력1");
		String str2=JOptionPane.showInputDialog("입력2");
		
		//처리
		//정수로 바꾸어서 처리를 하고싶으면, 프로그래머가
		//정수로 바꾸어주는 메소드를 사용해서 처리함
		
		int num1= Integer.parseInt(str1);
		int num2= Integer.parseInt(str2);
		
		//출력
		//자바는 정수와 정수의 연산의 결과는 무조건 정수
		//자바는 하나라도 실수면 결과는 실수로 나옴
		System.out.println((double)num1/num2);
		
		

	}

}
