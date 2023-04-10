package arr;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrTest {

	public static void main(String[] args) {
		// 1. int 값 5개 (55,66,77,22,33)입력받고 최소값 구해 출력
		
		Scanner sc=new Scanner(System.in);
		
		int num[]= new int[5];
		
		
		for (int i = 0; i < num.length; i++) {
			num[i]=sc.nextInt();
		}
		
		
		Arrays.sort(num);
		int min=num[0];
		
		System.out.println("min 값은? "+ min);
		
		
		
		//2 랜덤한 값 20개를 발생시켜 값의 범위 0~899를 빈 배열에 넣은 후 최대값 출력
		
		Random r= new Random(900);
		
		int num2[]=new int[20];
		
		Arrays.sort(num2);
		int max=num2[19];
		
		System.out.println("max "+ max);
		
		
		//3 String s1="참좋다" ,String s2="진짜 좋다" 두 문자열이 동일한지 출력 s1,s2글자수를 비교하여 누가 더 큰지 출력
		
		String s1="참좋다",s2="진짜좋다";
		System.out.println(s1.equals(s2));
		
		int n1=s1.length();
		int n2=s2.length();
		if(n1>n2) {
			System.out.println("s1큼");
		}
		else {
			System.out.println("s1큼");
		}
		
		String s3="나는 진짜 java programmer가 되었어";
		String result=s3.substring(6,21);
		System.out.println(result);
		System.out.println(result.toUpperCase());
		
		String s4="2056521";
		char result2=s4.charAt(0);
		if(result2=='1') {
			System.out.println("남자");
		}
		else {
			System.out.println("여자");
		}
	}

}
