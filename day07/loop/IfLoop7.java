package loop;

import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class IfLoop7 {

	public static void main(String[] args) {
		//1.암호를 대시오 ==>pass라고 입력
		//암호가 맞으면 "들어오세요"
		//암호가 틀리면 "나가세요"출력
		System.out.println("암호를 대시오");
		Scanner sc=new Scanner(System.in);
		String date1=sc.nextLine();
		
		
		if(date1.equals("pass"))
		{
			System.out.println("들어오세요");
		}
		else {
			System.out.println("나가");
		}	
		
		
		
		//2.당신이 먹고싶은 저녁 메뉴는?(짜장 , 라면, 회)에서 선택
		//자장면이면 "중국집으로 가요"
		//라면이면 "분식집으로 가요"
		//회면 "횟집으로 가요"출력
		//위에 없으면 안먹어요 출력
		System.out.println("당신이먹고싶은것(짜장면,라면,회 중에서 선택)");
		
		String menu=sc.nextLine();
		
		switch (menu) {
		case "짜장면":
			System.out.println("중국집으로");
			break;
		case "라면":
			System.out.println("분식집으로");
			break;
		case "회":
			System.out.println("횟집으로");
			break;
		default:
			System.out.println("안먹어여");
		}
		
		
		//3.JOptionPane을 사용
		//두 정수를 입력 받으세요 ==>누가 더 큰지 출력
		
		JOptionPane pen=new JOptionPane();
		String number1=pen.showInputDialog("정수1입력");
		
		JOptionPane pen2=new JOptionPane();
		String number2=pen2.showInputDialog("정수2입력");
		
		int num1=Integer.parseInt(number1);
		int num2=Integer.parseInt(number2);
		
		if(num1>num2)
		{
			System.out.println("정수1이 더큼");
		}
		else if(num1<num2){
			System.out.println("정수1이 더큼");
		}
		else if(num1==num2)
		{
			System.out.println("동일함");
		}
		
		
		
		
		
		//4.사원번호 -->A100EX
		//맨 앞에 있는 글자를 추출
		//A이면 기획부 ,B이면 총무부 ,C이면 개발부 아니면 해당부서 없음으로 출력
		System.out.println("사원번호 입력 예)A100EX): ");
		String ssn=sc.nextLine();
		char code =ssn.charAt(0);
		
		switch (code) {
		case 'A':
			System.out.println("기획부");
			break;
		case 'B':
			System.out.println("총무부");
			break;
		case 'C':
			System.out.println("개발부");
			break;

		default:
			System.out.println("해당부서없음");
			break;
		}
		

	}
}
