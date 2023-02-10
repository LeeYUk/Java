package arrayApp2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ArrayScTest {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num[]=new int[5];
		int sum=0;
		
		for (int i = 0; i < num.length; i++) {
			System.out.println("숫자 5개 입력");
			num[i]=sc.nextInt();
		}
		sum=num[0]+num[2];
		System.out.println("첫번쨰 값과 세번쨰 값의 합 "+sum);
		
		
		System.out.println("-----------------------");
		
		String str[]= new String[3];
		
		
		
		for (int i = 0; i < str.length; i++) {
			System.out.print("입력(자바,스프링,JSP순서대로 입력 >>)");
			str[i]=sc.next();
			
		}
		System.out.println(str[0]+"보다는 "+str[1]+" 로 출력");
		
		
		sc.close();
	}

}
