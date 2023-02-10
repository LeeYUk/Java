package arrayApp2;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ArraySc4 {

	public static void main(String[] args) {

		// 배열 응용5
		// 우리반 성적2

		Random r = new Random(42);
		int num1[] = new int[1000];
		int num2[] = new int[1000];

		for (int i = 0; i < num2.length; i++) {
			num1[i] = r.nextInt(101);
			num2[i] = r.nextInt(101);
		}
		

		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		
		for (int i = 0; i < num2.length; i++) {
			if (num1[i] == num2[i]) {
				count1++;
			} 
			else if(num1[i]!=num2[i]) {
				count2++;
			}
			else if(num1[i]>num2[i]) {
				count3++;
				System.out.println("1학기 성적이 높은 학생 "+i);
			}
			else if(num1[i]<num2[i]) {
				count4++;
				System.out.println("2학기 성적이 높은 학생 "+i);
			}
		}
		System.out.println("동일한 개수" + count1 + "개");
		System.out.println("동일하지 않은 개수" + count2 + "개");
		System.out.println("1학기 성적이 높은학생" + count3 + "개");
		System.out.println("2학기 성적이 높은 학생" + count4 + "개");

		
		
		
		
		//2학기에 성적이 더 오른 학생은 몇명?? 누구??
		//1학기 성적이 더 좋았던 학생은 몇명?? 누구??
	}

}
