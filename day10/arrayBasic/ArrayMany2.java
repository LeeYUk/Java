package arrayBasic;

import java.util.Random;

public class ArrayMany2 {

	public static void main(String[] args) {
		//많은 양 만들어보기 2
		
	int num1[]=new int[1000];
	
	Random r=new Random();
	
	//2 부터 20까지 임의로 만들어 배열에 넣어보세여
	for (int i = 0; i < num1.length; i++) {
		num1[i]= r.nextInt(19)+2;
	}

	System.out.println("========================");
	//전체 출력
		for (int x : num1) {
		System.out.println(x);
	}
	System.out.println("========================");
	
	//3이상인 숫자 몇 개인지 출력
	int count =0;
	int sum=0;
	for (int i = 0; i < num1.length; i++) {
		if(num1[i]>=15)
		{
			sum=sum+num1[i];
			count++;
		}
	}
	System.out.println("15 이상 갯수"+count);
	System.out.println(sum);//15보다 큰수 누적 더하기
  }

}
