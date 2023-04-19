package sort;

import java.util.Arrays;

public class Swap4 {
	public static void main(String[] args) {
		//스왑 테스트4
		String str[]= {"햄버거", "샌드위치", "커피"};
		print(str);
		
		swap(str, 0, 1);
		print(str);
	}
	
	public static void swap(String s[] ,int in1, int in2) { //in1는 index1 , in2는index2
		System.out.println(s[in1]+ ","+s[in2]);
		String temp= s[in2];
		s[in2]=s[in1];
		s[in1]=temp;
		
	}
	
	
	public static void print(int num[]) {
		System.out.println(Arrays.toString(num));
	}
	
	public static void print(String str[]) {
		System.out.println(Arrays.toString(str));
	}


}


