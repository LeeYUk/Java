package arrayApp2;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ArraySc6 {

	public static void main(String[] args) {

	//여러 배열 사용하기
		
		String name[]= {"홍길동","이순신","뉴진스","방탄","블핑"};
		int term1[]= {77,88,99,55,70};
		int term2[]= {99,100,88,80,70};
		int sum1=0;
		int sum2=0;
		double num1=0;
		double num2=0;
		int count1=0;
		int count2=0;
		int count3=0;
		//1. 2학기 성적이 오늘 학생 몇명??
		//2. 1학기 2학기 성적이 동일 한 학생 몇명?
		//3. 2학기 학생 중 만점(100)인 학생의 이름과 번호는?
		//4. 1학기 성적의 평균과 2학기 성적의 평균 중 누가 더 높았나요?
		//5. 뉴진스의 1학기 성적 2학기 성적은?
		
		
		for (int i = 0; i < term2.length; i++) {
			
			sum1=sum1+term1[i];
			sum2=sum2+term2[i];
			num1=num1/term1.length;
			num2=sum2/term2.length;
			
			if(term1[i]<term2[i]) {
				count1++;
			}
			else if(term1[i]==term2[i]) {
				count2++;
			}
			
			if(term2[i]==100)
			{
				count3++;
				System.out.println("성적이 동일한 학생 : "+count3+"명" +"," +name[i]+" , "+i);//3
			}
			
			
		}
		
		
		
		System.out.println("2학기 성적이 오른 학생 : "+count1+"명");//1
		System.out.println("성적이 동일한 학생 : "+count2+"명");//2
		
		
		if(num1>num2) //4
		{
			System.out.println("1학기 성적 평균이 높다");
		}
		else if(num1<num2)
		{
			System.out.println("2학기 성적 평균이 높다");
		}
		
		
		
		
		for (int i = 0; i < term2.length; i++) {
			if(name[i].equals("뉴진스")) {
				System.out.println("뉴진스의 인덱스 위치는"+i);
				System.out.println("뉴진스의 1학기 성적은"+term1[i]);
				System.out.println("뉴진스의 2학기 성적은"+term2[i]);
			}
		}
		
		
		
	}

}
