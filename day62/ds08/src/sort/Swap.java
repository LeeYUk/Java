package sort;

import java.util.Arrays;

public class Swap {
	public static void main(String[] args) {
		//스왑 테스트
		int num[]= {6, 1, 2, 3, 5, 9};
		System.out.println(Arrays.toString(num));
		
		//num[0] --> 6, num[5] --> 9
		int temp=num[5]; //temp <--9
		
		num[5] =num[0]; //num[5] <--6
		num[0] =num[5];//num[0] <--6
		
		System.out.println(Arrays.toString(num));
	}

}
