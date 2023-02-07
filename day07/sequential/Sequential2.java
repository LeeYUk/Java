package sequential;

import javax.swing.JOptionPane;
//import javax.swing.JFrame;

public class Sequential2 {

	public static void main(String[] args) {
		//순차문2
		// 기본순차문 ==>입력 --> 처리 -->출력
		//입력 -> (예제)scanner
		//입력창 예제) 
		 String str1=JOptionPane.showInputDialog("정수를 입력하시오1");
		 String str2=JOptionPane.showInputDialog("정수를 입력하시오2");
		
		//처리 ->글자 연결(+연산자 사용,결합 연산자)
		// 더해지는 데이터가 하나라도 String이면 결과는 무조건 String
		// 입력받은 문자데이터를 int로 변경해야함
		 int num1=Integer.parseInt(str1);
		 int num2=Integer.parseInt(str2);
		 int result= num1+num2;//결과는  String이나 String데이터를 int로 변경했기 때문에 result를 int형으로변형  
		 
		//출력 ->보는 화면에 출력
		 System.out.println(result);
		 JOptionPane.showMessageDialog(null,result);

	}

}
