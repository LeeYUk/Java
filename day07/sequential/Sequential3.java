package sequential;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Sequential3 {

	public static void main(String[] args) {
		//bmi지수 구하기
		
		Scanner scanner=new Scanner(System.in);
		
		double height=scanner.nextDouble();//키 m단위로 입력
		double weight=scanner.nextDouble();//몸무게
		
		double Bmi=weight/((height*height));
		
		System.out.println(Bmi);
		
		
		
	}
}
