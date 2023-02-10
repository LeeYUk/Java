package arrayApp2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ArraySc5 {

	public static void main(String[] args) {

		// 배열 응용4
		//우리반 성적
		
		int num1[]= {44,66,77,22,11};
		int num2[]= {33,55,77,22,40};
		
		int count1=0;
		int count2=0;
		for (int i = 0; i < num2.length; i++) {
			if(num1[i]==num2[i]) {
				count1++;
			}
			else {
				count2++;
			}
			
		}
		System.out.println("동일한 개수"+count1+"개");
		System.out.println("동일하지 않은 개수"+count2+"개");

	}

}
