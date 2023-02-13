package arrayReview;

import java.util.Random;

public class Array1 {

	public static void main(String[] args) {
		// 배열 비교
		//배열 하나당 990개의 저장공간 필요, 실제 생성된 저장 공간 개수
		//입력: 많은 양의 저장공간(배열 , 2개)
		//반복문으로 배열 위치(인덱스)를 옮기면서 데이터를 넣자
		
		int num1[]=new int[990];//답안지
		int num2[]=new int[990];//나의 답
//		System.out.println(num1.length);//num1의 배열 길이
//		System.out.println(num2.length);//num2의 배열 길이
//		System.out.println(num1);//num1의 배열주소
//		System.out.println(num2);//num2의 배열주소
		
		Random r= new Random(42);//수동 랜덤 값
		
		for (int i = 0; i < num2.length; i++) {
			num1[i]=r.nextInt(4)+1;
			num2[i]=r.nextInt(4)+1;
		}
		
		System.out.println("번호\t:\t답안\t\t내답");
		for (int i = 0; i < num2.length; i++) {
			System.out.println(i+"\t:\t" + num1[i] + "\t<->\t" + num2[i]);
		}
		//처리 :두배열의 같은 인덱스가 같은 문항을 비교
		//동일하면 1점씩 획득
		int sum1=0;
		 
		for (int i = 0; i < num2.length; i++) {
			if(num1[i]==num2[i])
			{
				sum1++;
			}
		}
		//출력
		System.out.println("토익점수는 "+sum1+ " 점");
		
	}

}
