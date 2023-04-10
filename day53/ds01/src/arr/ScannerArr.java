package arr;

import java.util.Scanner;

public class ScannerArr {

	public static void main(String[] args) {
		// 입력해서 배열넣기
		
		Scanner sc=new Scanner(System.in);
		
		int num[]=new int[3];
		
		for (int i = 0; i < num.length; i++) {
			num[i]=sc.nextInt(); //입력받고 int변환 후 배열에 삽입
		}
		//java프로그램과 console을 stream open
		sc.close();//stream close
		for (int x : num) {
			System.out.println(x);
		}
		
		for (int i = 0; i < num.length; i++) {
			if(num[i]==33) {
				System.out.println("index는 "+i);
			}
		}
	}

}
