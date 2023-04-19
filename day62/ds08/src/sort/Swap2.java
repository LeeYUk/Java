package sort;

import java.util.Arrays;

public class Swap2 {
	public static void main(String[] args) {
		//스왑 테스트2
		int num[]= {6, 1, 2, 3, 5, 9};
		//System.out.println(Arrays.toString(num));
		print(num);
		
		//num[0] --> 6, num[5] --> 9
		int temp=num[5]; //temp <--9
		
		num[5] =num[0]; //num[5] <--6
		num[0] =temp;//num[0] <--9
		//System.out.println(Arrays.toString(num));
		print(num);
	}
	
	public static void print(int num[]) {
		System.out.println(Arrays.toString(num));
	}
	
	public static void print(String str[]) {
		System.out.println(Arrays.toString(str));
	}


}


