package arr;

import java.util.Arrays;
import java.util.Random;

public class ArrMaximum2 {

	public static void main(String[] args) {
		// 배열의 최대값 구하기2 
		Random r= new Random(100);

		int s[]= new int[10];
		int s2[]= new int[10];
		
		for (int i = 0; i < args.length; i++) {
			s[i]=r.nextInt(1000);	
			s2[i]=r.nextInt(1000);	
		}
		
		//오름차순 정렬한 다음 맨앞 (최소값),맨끝 (최대값)
		Arrays.sort(s);
		
		System.out.println("min "+s[0]);
		System.out.println("max "+s[9]);
		
		if(Arrays.equals(s, s2)) {
			System.out.println("2개의 배열이 같다");
		}
		else {
			System.out.println("2개의 배열이 다르다");
		}
		
		String result=Arrays.toString(s);
		System.out.println(result);
		
		
	}

}
