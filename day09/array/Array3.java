package array;

import java.util.Arrays;

public class Array3 {

	public static void main(String[] args) {
		// 배열 다루기
		int a[]=new int[5];
		System.out.println("배열의 크기: "+a.length);//배열의 크기 출력
		
		a[0]=100;
		System.out.println(a[0]);//배열의 첫번쨰 위치에 100넣어서 출력
		
		a[4]=500;//배열의 마지막위치에 500넣어서 출력
		System.out.println(a[4]);
		
		a[2]=200;//배열의 3번쨰 위치에 200넣어서 출력
		System.out.println(a[2]);
		
		System.out.println("배열의 전체 데이터");
		for(int i=0;i<5;i++)
		{
			System.out.print(" "+i+":"+a[i]);//배열의 전체 데이터를 출력
		}
	}
}
