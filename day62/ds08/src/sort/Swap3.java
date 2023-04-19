package sort;

import java.util.Arrays;

public class Swap3 {
	public static void main(String[] args) {
		//스왑 테스트3
		int num[]= {6, 1, 2, 3, 5, 9};
		print(num);
		
		swap(num,0, 5); //swap(6,9)
		print(num);
	}
	
	public static void swap(int num[] ,int x, int y) { //x는 index1 , y는index2
		System.out.println(num[x]+ ","+num[y]);
		int temp=num[y];
		num[y]=num[x];
		num[x]=temp;
		
		System.out.println(num[x]+ ","+num[y]);
	}
	
	
	public static void print(int num[]) {
		System.out.println(Arrays.toString(num));
	}
	
	public static void print(String str[]) {
		System.out.println(Arrays.toString(str));
	}


}


