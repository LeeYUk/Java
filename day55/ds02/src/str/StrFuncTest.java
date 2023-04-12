package str;

import java.util.Arrays;

public class StrFuncTest {

	public static void main(String[] args) {
		//문자열함수 심화문제
		
		String s5="[ 10, 20, 30, 40, 50]";
		
		//String  s5="[ 10, 20, 30, 40, 50]";에서
		//모든 데이터를 꺼내 더한값을 출력
		
		//[, ] -replace()를 이용해 제거
		s5=s5.replace("[", "");
		s5=s5.replace("]", "");
		System.out.println(s5);
		
		s5=s5.trim();
		System.out.println(s5);
		
		System.out.println(s5.length());//18글자
		String s55[]=s5.split(", ");//{"10","20","30",~}
		System.out.println(s55[0]);
		System.out.println(s55[1]);
		System.out.println(s55[2]);
		
		int sum=0;
		
		for (String x : s55) {
			int x2=Integer.parseInt(x);// 문자열의 s5의 배열의 값을 int형을 변환
			sum+=x2;
		}
		
		System.out.println(sum);
		
//		=================================================
		//위의 문제에서 생성된 String[]의 값을 새로운 int[]로 옮겨서 오름차순으로 정렬후 출력
		int newArray[] =new int[s55.length];
		
		for(int i=0;i<newArray.length; i++) {
			newArray[i]=Integer.parseInt(s55[i]);
		}
		System.out.println(Arrays.toString(newArray));

	}

}
