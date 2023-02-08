package loop;

import javax.swing.JOptionPane;

public class Accumulate2 {

	public static void main(String[] args) {
		//1.숫자 누적
		//5부터 300까지 5의 배수만 모두 더해 출력
		int sum=0;
		for (int i = 5; i < 300; i++) { 
			if(i%5==0){sum=sum+i;}
		}
		System.out.println(sum);
		
		//2.문자누적
		//먹고싶은 음식 4가지 입력받기
		//다음과 같이 되도록 해보시오
		//감자랑 고구마랑 딸기랑 커피
		
		String sum2= "";
		for (int i = 0; i < 4; i++) {
			String data=JOptionPane.showInputDialog("먹고싶은거 4개");
			sum2=sum2+data+"랑 ";
		}
		System.out.println(sum2);
		
	}

}
