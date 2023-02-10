package arrayApp2;

import java.util.Random;

import javax.swing.JOptionPane;

public class ArraySc2 {

	public static void main(String[] args) {
	//수능 1000명의 점수를 처리
		//랜덤으로 10000의 점수를 넣어주세요
		//0~450
		//1) 만점자가 몇 명인지? 누구인지(인덱스)
		//2)0점이 몇명인지??
		//3)평균은 어떻게 되었는지 합계를 먼저구해야함
		
		
		int num1[]=new int[10000];
		Random r=new Random();
		
		int sum=0;
		int maxCount=0;
		int minCount=0;
		
		for (int i = 0; i < num1.length; i++) {
			num1[i]=r.nextInt(451);
			 sum=sum+num1[i];//전체합구하기
			
			
				System.out.println(i+" : "+num1[i]);
		}
		
		for (int x : num1) {
			if(x==450) {
				maxCount++;
			}
		}
		System.out.println("만점자는 : "+maxCount);
		
		for (int x : num1) {
			if(x==0) {
				minCount++;
			}
		}
		
		//점수의 상위 30% 구하기
		
		
		System.out.println("0점자는 : "+minCount);
		
		System.out.println("평균은 : "+(double)sum / (num1.length));
		
	}

}
