package loop;

import javax.swing.JOptionPane;

public class Accumulate {

	public static void main(String[] args) {
		// 누적
		//iu=iu+1;
		//sum=sum+i
		
		//숫자누적
		int sum=0;//변수선언 및 초기화
		for (int i = 0; i <= 1000; i++) {
			sum=sum+i;	
		}
		System.out.println(sum);
		
		//글자누적
		String sum2="";
		for (int i = 0; i < 3; i++) {
			String data=JOptionPane.showInputDialog("아무말");
			sum2=sum2+data;
		}
		System.out.println(sum2);

	}

}
