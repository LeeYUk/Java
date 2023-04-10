package arr;

import java.util.Random;

public class ArrMaximum {

	public static void main(String[] args) {
		// 배열의 최대값 구하기
		Random r= new Random(100);

		int s[]= new int[1000];
		int max=s[0];
		
		for (int i = 0; i < args.length; i++) {
			s[i]=r.nextInt(1000);
		}
		
		for (int x : s) {
			if(x>max){
				max=x;
			}
		}
		System.out.println(max);
	}

}
