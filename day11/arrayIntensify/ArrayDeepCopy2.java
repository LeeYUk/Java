package arrayIntensify;

public class ArrayDeepCopy2 {

	public static void main(String[] args) {
		// 배열의 깊은 복사
		
		int num3[]= {100,200,300};
//		int num4[]=num3; //앝은 복사
		int num4[]=num3.clone();//깊은 복사
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num3==num4);
		
		num3[0]=999;
		for (int i = 0; i < num3.length; i++) {
			System.out.println(num3[i]);
		}
		System.out.println();
		for (int i = 0; i < num4.length; i++) {
			System.out.println(num4[i]+" ");
		}

	}

}
