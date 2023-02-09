package control_qus;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		// 로또 번호 생성기
		
		Random r=new Random(); //랜덤 숫자 생성 인스턴스 호출 Random함수안에 임의로 숫자 입력시 항상 같은 숫자 생성
		for (int i = 0; i < 6; i++) {
			System.out.println("로또번호 : " + r.nextInt(10));
		}
		

	}

}
