package sequential;

import javax.swing.JOptionPane;

public class Sequential1 {

	public static void main(String[] args) {
		// 기본순차문 ==>입력 --> 처리 -->출력
		//입력 -> (예제)scanner
		//입력창 예제) 
		 String str1=JOptionPane.showInputDialog("입력하시오");
		 String str2=JOptionPane.showInputDialog("다시 입력하시오");
		
		//처리 ->글자 연결(+연산자 사용,결합 연산자)
		// 더해지는 데이터가 하나라도 String이면 결과는 무조건 String 
		 String result= str1+str2;//결과는  String
		 
		//출력 ->보는 화면에 출력
		 System.out.println(result);

	}

}
