package control_qus;

import java.util.Random;
import java.util.Scanner;

public class NumberAns {

	public static void main(String[] args) {
		// 숫자 맞추기 프로그램
		//1.유저에게 힌트주기
		//2.프로그램이 실행될때마다 정답을 렌덤으로 바꾸기
		//3.전체 시도 횟수
		Scanner sc=new Scanner(System.in);
		
		Random ran=new Random();
		int target=ran.nextInt(100);
		
		int count=0;
		
		for(;;) 
		{	
			System.out.print("당신이 생각한 정답은");
			int data=sc.nextInt();
			count++;
			System.out.println(count);
		if (data ==target) {
			System.out.println("정답");
			break;
		}
		else if(data<target)
		{
			System.out.println("정답보다 숫자가 작습니다");
		}
		else if(data>target) {
			System.out.println("정답보다 숫자가 큽니다");
		}
		
	  }
		sc.close();
	}

}
