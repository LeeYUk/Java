package arr;

import java.util.Scanner;

public class ScannerArr2 {

	public static void main(String[] args) {
		// 입력해서 배열에 넣기2
		
		Scanner sc= new Scanner(System.in);
		int count1=0;
		int count2=0;
		
		double num[]=new double[5];
		
		for (int i = 0; i < num.length; i++) {
			num[i]=sc.nextDouble();
		}
		
		for (double x : num) {
			System.out.println(x);
		}
		
		for (int i = 0; i < num.length; i++) {
			if(num[i]==33.3)
			{
				System.out.println("33.3 위치는 "+i);
				
			}
			
			if(num[i]==22.2)
			{
				System.out.println("22.2 위치는 "+i);
				
			}
		}
		

	}

}
