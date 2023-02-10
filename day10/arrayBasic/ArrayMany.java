package arrayBasic;

import java.util.Random;

public class ArrayMany {

	public static void main(String[] args) {
		//많은 양 만들어보기
		
		int num1[]= new int[999];
		for (int x : num1) {
			System.out.println(x);
		}
		System.out.println("---------------------");
		
		Random r=new Random();
//		int data=r.nextInt(4)+1; //0~3까지 출력 ,+1을 하게 되면 범위1~4로 됨
//		System.out.println(data);
		
		for (int i = 0; i < num1.length; i++) {
			num1[i]=r.nextInt(4)+1;
		}
		for (int x : num1) {
			System.out.println(x);
		}
		
	}

}
