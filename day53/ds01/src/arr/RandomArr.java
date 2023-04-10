package arr;

import java.util.Random;

public class RandomArr {
	
	public static void main(String[] args) {
	Random r=new Random(100);
	
	int num[]=new int[100];
	
	for (int i = 0; i < num.length; i++) {
		num[i]=r.nextInt(101);
	}
	
	for (int i = 0; i < num.length; i++) {
		System.out.println(i+": "+num[i]);
	}
		
		
		
	}
	
}
