package conditional;

import java.util.Scanner;

public class Sc {

	public static void main(String[] args) {
		// scanner콘솔입력
		
		Scanner sc=new Scanner(System.in); //scanner인스턴스 생성
		int data=sc.nextInt(); //String을 Int로 변환
		if(data==1) {
			System.out.print("달리자");
		}
		else {
			System.out.print("쉬자");
		}
		System.out.print("주말에 뭐함");
		String data2=sc.next();
		System.out.print("나는 주말에"+data2+"함");
		
		sc.close();
	}

}
