package arr;

import java.util.Scanner;

public class ScannerArr4 {

	public static void main(String[] args) {
		// 입력해서 배열에 넣기4
		//11.1 22.2 22.2 22.2 55.5을 입력해서 배열에 저장후 출력
		//22.2가 몇개인지 출력
		
		Scanner sc= new Scanner(System.in);
		int count=0;
		
		
		double num[]=new double[5];
		
		for (int i = 0; i < num.length; i++) {
			num[i]=sc.nextDouble();
		}
		
		for (double x : num) {
			System.out.println(x);
		}
		
		for (int i = 0; i < num.length; i++) {
			if(num[i]==22.2)
			{
				System.out.println("22.2 위치는 "+i);
				count++;
			}
		}
		

		System.out.println("22.2의 갯수는 "+count);
	}

}
