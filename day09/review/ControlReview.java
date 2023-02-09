package review;

import java.util.Scanner;

public class ControlReview {

	public static void main(String[] args) {
		// 제어문 정리
		Scanner sc=new Scanner(System.in);
		//3. 시작값과 종료값 입력후 시작값과 종료값을 모두 더함 , 100을 넘으면 프로그램 종료
		
		System.out.print("시작값");
		int start=sc.nextInt();
		
		System.out.print("종료값");
		int end=sc.nextInt();
		
		int sum=0;
		for(int i=start ; i<=end; i++) {
			sum=sum+i;
		}
		
		if(sum<100) {
			System.out.println("더한값은 "+sum);
		}
		else {
			System.out.println("더한값이 100을 넘어 종료 ");
		}
		
		
		//4.
		// - 시작값, 종료값, 점프값 입력
//	     시작값부터 종료값까지 점프값만큼 증가하면서 더함.
//		 더한 값을 출력
//	     더한 값이 100을 넘으면 프로그램 종료
//	System.out.print("시작값>> "); //1, 1000
//	int start = sc.nextInt();
//	System.out.print("종료값>> "); //10, 2000
//	int end = sc.nextInt();
//	System.out.print("점프값>> "); //5
//	int jump = sc.nextInt();
//	
//	int sum = 0;
//	for (int i = start; i <= end; i = i + jump) {
//		sum = sum + i;
//		if (sum >= 100) {
//			System.exit(0);
//		}
//	}
//	System.out.println("최종 더한 값은 " + sum);
		
		
		sc.close();

	}

}
